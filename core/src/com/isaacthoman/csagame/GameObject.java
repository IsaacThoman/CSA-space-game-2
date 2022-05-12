package com.isaacthoman.csagame;


import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameObject {
    protected double size = 1;

    public GameObject(){
    }


    public void render(ShapeRenderer renderer, int x, int y, int vertices){
        renderer.begin(ShapeRenderer.ShapeType.Line);
        renderer.polygon(PolyTools.shift(toPolygon(vertices),x,y));
        renderer.end();
    }
    public float[] toPolygon(int vertices){
        return new float[0];
    }

}
