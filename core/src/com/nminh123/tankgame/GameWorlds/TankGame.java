package com.nminh123.tankgame.GameWorlds;

import com.badlogic.gdx.Game;

public class TankGame extends Game {
	@Override
	public void create() {
		setScreen(new GameScreen());
	}
}
