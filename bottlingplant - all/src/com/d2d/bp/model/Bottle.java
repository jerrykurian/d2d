package com.d2d.bp.model;

/**
 * Created by Jerry Kurian on 17-02-2017.
 */
public class Bottle {
    private static int TOTAL_POURED = 0;
    public void pour(){
        System.out.println("Poured " + ++TOTAL_POURED);
    }
}
