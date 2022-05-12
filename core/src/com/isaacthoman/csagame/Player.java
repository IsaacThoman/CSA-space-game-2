package com.isaacthoman.csagame;

public class Player {
    public double controlDegree = Math.PI/2;
    private int centerX = 425;
    private int centerY = -200;
    private int distFromCenter = 500;



    public Player(){

    }
    public int getX(){
        return (int)(centerX+distFromCenter*Math.cos(controlDegree));
    }
    public int getY(){
        return (int)(centerY+distFromCenter*Math.sin(controlDegree));

    }
    public double getDir(){
        return controlDegree/Math.PI*180-90;
    }



}
