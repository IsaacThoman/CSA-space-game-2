package com.isaacthoman.csagame;

public class PolyTools {
    public static float[] mult(float[] f, double x, double y){
        for(int i = 0; i<f.length; i++) {
            if (i % 2 == 0)
                f[i] *= x;
            else
                f[i] *= y;
        }
        return f;
    }
    public static float[] shift(float[] f, int x, int y){
        for(int i = 0; i<f.length; i++) {
            if (i % 2 == 0)
                f[i] += x;
            else
                f[i] += y;
        }
        return f;
    }

    public static float[] rotate(float[] f, int x, int y, double ang){
        for(int i = 0; i<f.length; i+=2) {
            double dir = Math.atan2(f[i+1]-y,f[i]-x);
            double mag = Math.sqrt(Math.pow((f[i]-x),2) + Math.pow((f[i+1]-y),2));

        }
        return f;
    }

}
