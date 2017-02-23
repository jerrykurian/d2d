package com.d2d.bp.services;

import com.d2d.bp.model.Bottle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry Kurian on 17-02-2017.
 */
public class BottleRack {
    private List<Bottle> rack = new ArrayList<Bottle>();
    private int MIN_CAPACITY = 100;

    public void addBottle(Bottle bottle){
        rack.add(bottle);
    }

    public Bottle removeBottle(){
        if(!rack.isEmpty()){
            Bottle bottle = rack.remove(0);
            if(rack.size()<=MIN_CAPACITY){
                capacityReached();
            }
            return bottle;
        }else {
            return null;
        }
    }

    public void capacityReached(){

    }
}
