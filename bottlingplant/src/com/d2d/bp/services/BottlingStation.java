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

    public void fillBottle(Bottle bottle){
        if(!taps.isEmpty()){
            Tap tap = taps.get(0);
            tap.fill(bottle);
        }else{
            System.out.println("Unable to fill bottle");
        }
    }
}
