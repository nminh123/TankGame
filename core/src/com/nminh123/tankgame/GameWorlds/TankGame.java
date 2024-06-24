package com.nminh123.tankgame.GameWorlds;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.nminh123.tankgame.Levels.Level_1;


public class TankGame extends Game {

	Batch batch;
	@Override
	public void create() {
		setScreen(new Level_1(this));
		setScreen(new GameScreen());
	}

	@Override
	public void dispose() {

	}

	@Override
	public void render() {

		super.render();
	}
}
