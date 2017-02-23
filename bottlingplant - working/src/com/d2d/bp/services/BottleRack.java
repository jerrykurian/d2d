package com.d2d.bp.services;

import com.d2d.bp.model.Bottle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry Kurian on 17-02-2017.
 */
public class BottleRack {
    private List<Bottle> rack = new ArrayList<Bottle>();
    private int THRESHOLD = 30;
    public void init(){
        for(int i=0;i<200;i++){
            addBottle(new Bottle());
        }
    }

    public void addBottle(Bottle bottle){
        if(rack.size()<200) {
            synchronized (this.rack) {
                rack.add(bottle);
                this.rack.notify();
            }
        }
    }

    public Bottle removeBottle() throws InterruptedException {
        if(!rack.isEmpty()){
            Bottle bottle = rack.remove(0);
            return bottle;
        }else {
            synchronized (this.rack){
                this.rack.wait();
                return removeBottle();
            }
        }
    }
}
