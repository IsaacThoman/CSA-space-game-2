package com.isaacthoman.csagame;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.PolygonRegion;
import com.badlogic.gdx.graphics.g2d.PolygonSprite;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.EarClippingTriangulator;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.ShortArray;

public class Renderer {

    static float[] shipVerts = {0,0,-2f,-1f,0,2.2f,2f,-1f};
    static ShapeRenderer shapeRenderer;

    static PolygonSprite poly;
    static PolygonSpriteBatch polyBatch;
    static Texture textureSolid;

    public static void init(){
        shapeRenderer = new ShapeRenderer(500000);

        polyBatch = new PolygonSpriteBatch();
        Pixmap pix = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
        pix.setColor(1,0,1,1);
        pix.fill();

        textureSolid = new Texture(pix);
        EarClippingTriangulator triangulator = new EarClippingTriangulator();
        ShortArray triangleIndicies = triangulator.computeTriangles(shipVerts);
        PolygonRegion polyReg = new PolygonRegion(new TextureRegion(textureSolid),shipVerts, triangleIndicies.toArray());
        poly = new PolygonSprite(polyReg);
        poly.setOrigin(0,0);
        polyBatch = new PolygonSpriteBatch();
    }

    public static void render(){
        ScreenUtils.clear(0, 0, 0, 1);

        //player
        polyBatch.begin();
        poly.draw(polyBatch);
        polyBatch.end();
        poly.setPosition(MyGdxGame.player.getX(),MyGdxGame.player.getY());
        poly.setScale(10,10);
        poly.setRotation((float)MyGdxGame.player.getDir());


        //planet

    }
}
