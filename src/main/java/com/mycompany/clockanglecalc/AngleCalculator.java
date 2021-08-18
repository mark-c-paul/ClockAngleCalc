/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clockanglecalc;

/**
 *
 * @author jkgme
 */
public class AngleCalculator {
    public static int calcAngle(int h, int m){
        //catch invalid inputs
        if (h < 0 || m < 0 || h > 24 || m > 59){
            throw new IllegalArgumentException("Wrong input");
        }
        
        //covert 24hour clock into 12 hour
        h = h % 12;
        //adjust hour hand by half a degree every minute
        int hour_angle = (int)(0.5 * (h*60 + m));
        //adjust minute hand by 6 degrees every minute
        int minute_angle = (int)(6*m);
        //get acute angle
        int angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360-angle, angle);
 
        return angle;
    }
}
