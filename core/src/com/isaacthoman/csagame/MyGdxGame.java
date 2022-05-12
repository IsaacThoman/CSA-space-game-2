package com.isaacthoman.csagame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Input.Keys keys;

	public static Player player;
	static double playerVelocity = 0;

	@Override
	public void create () {
		keys = new Input.Keys();
		player = new Player();
		Renderer.init();
	}

	@Override
	public void render () {
		//ScreenUtils.clear(0, 0, 0, 1);
		Renderer.render();

		playerVelocity/=1.2;

		if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
			playerVelocity+=0.002;
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
			playerVelocity-=0.002;

		if(playerVelocity>0.15)
			playerVelocity = 0.15;
		if(playerVelocity<-0.15)
			playerVelocity = -0.15;
		player.controlDegree+=playerVelocity;


	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
