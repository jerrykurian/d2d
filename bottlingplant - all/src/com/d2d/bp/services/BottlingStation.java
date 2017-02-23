package com.d2d.bp.services;

import com.d2d.bp.model.Bottle;
import com.d2d.bp.model.Tap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry Kurian on 17-02-2017.
 */
public class BottlingStation {
    private List<Tap> taps = new ArrayList<Tap>();

    public void init(){
        for(int i=0;i<20;i++){
            this.taps.add(new Tap());
        }
    }

    public void fillBottle(Bottle bottle){
        synchronized (this.taps) {
            if (!taps.isEmpty()) {
                Tap tap = taps.remove(0);
                tap.fill(bottle);
                //System.out.println("Bottle Filled");
                releaseTap(tap);
            } else {
                //System.out.println("No Tap Found, waiting");
                try {
                    this.taps.wait();
                    //System.out.println("Tap Available, filling");
                    fillBottle(bottle);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void releaseTap(Tap tap){
        synchronized (this.taps){
            this.taps.add(tap);
            this.taps.notify();
        }
    }
}
