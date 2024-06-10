package com.nminh123.tankgame;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.nminh123.tankgame.GameWorlds.TankGame;
import com.nminh123.tankgame.utils.Constants;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setWindowedMode(Constants.APP_WIDTH, Constants.APP_HEIGHT);
		config.setTitle("TankGame");
		new Lwjgl3Application(new TankGame(), config);
	}
}
