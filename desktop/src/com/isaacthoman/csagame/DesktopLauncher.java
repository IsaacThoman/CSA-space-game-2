package com.isaacthoman.csagame;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.isaacthoman.csagame.MyGdxGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setBackBufferConfig(8,8,8,8,16,0,3);
		config.setForegroundFPS(60);
		config.setTitle("CSA Game");
		config.setWindowedMode(850,850);
		new Lwjgl3Application(new MyGdxGame(), config);
	}
}
