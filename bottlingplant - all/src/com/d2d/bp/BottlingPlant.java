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
    private int TOTAL_THREADS = 10;
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
        rack.init();
        station.init();
        for(int i=0;i<TOTAL_THREADS;i++){
            Thread t = new Thread(new Stocker());
            t.start();
        }
        for(int i=0;i<TOTAL_THREADS;i++){
            Thread t = new Thread(new Filler());
            t.start();
        }
    }

    public void startFilling(){
        //System.out.println("Filling Bottle");
        Bottle bottle = null;
        try {
            while(true){
                bottle = rack.removeBottle();
                station.fillBottle(bottle);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void restockBottles(){
        while (true) {
            //System.out.println("Stocking Bottle");
            rack.addBottle(new Bottle());
        }
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
