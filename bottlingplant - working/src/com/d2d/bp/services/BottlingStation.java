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
        if(!taps.isEmpty()){
            Tap tap = taps.get(0);
            tap.fill(bottle);
            //System.out.println("Bottle Filled");
            releaseTap(tap);
        }else{
            //System.out.println("No Tap Found, waiting");
            synchronized (this.taps){
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
