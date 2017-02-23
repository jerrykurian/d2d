package com.d2d.bp;

import com.d2d.bp.model.Bottle;
import com.d2d.bp.services.BottleRack;
import com.d2d.bp.services.BottlingStation;

/**
 * Created by Jerry Kurian on 17-02-2017.
 */
public class BottlingPlant {
    private BottleRack rack = new BottleRack();
    private BottlingStation station = new BottlingStation();
    public static void main(String[] args){
        BottlingPlant plant = new BottlingPlant();
        plant.startOperations();
        try{
            int r = System.in.read();
            while (r>0){
                Thread.sleep(1000);
            }

        }catch (Exception e){

        }
    }
    public void startOperations(){
        for(int i=0;i<10;i++){
            Thread t = new Thread(new Stocker());
            t.start();
        }
        for(int i=0;i<10;i++){
            Thread t = new Thread(new Filler());
            t.start();
        }
    }

    public void startFilling(){
        System.out.println("Filling Bottle");
        Bottle bottle = rack.removeBottle();
        station.fillBottle(bottle);
    }

    public void restockBottles(){
        System.out.println("Stocking Bottle");
        rack.addBottle(new Bottle());
    }

    public class Filler implements Runnable{

        @Override
        public void run() {
            startFilling();
        }
    }

    public class Stocker implements Runnable{

        @Override
        public void run() {
            restockBottles();
        }
    }
}
