package com.mycompany.clockanglecalc;

import static com.mycompany.clockanglecalc.AngleCalculator.calcAngle;

/**
 * @author jkgme
 */
public class MainClass {
    public static void main(String[] args) {
        //converts arguments to int
        int[] myInts = new int[2];
        for (int i = 0; i < args.length; i++){
            try {
                myInts[i] = Integer.parseInt(args[i]);
            }
            catch (NumberFormatException nfe) {
                System.out.println("The argument must be a int.");
                System.exit(1);
            }
        }
        if (args.length == 2) {
            System.out.println(calcAngle(myInts[0], myInts[1]));
        }
        else{
            System.out.println("Only two arguments are accepted.");
            System.exit(1);
        }
    }
}
