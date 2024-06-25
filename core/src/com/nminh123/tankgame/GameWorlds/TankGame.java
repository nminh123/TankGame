package com.nminh123.tankgame.GameWorlds;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nminh123.tankgame.Levels.Level_1;


public class TankGame extends Game {

	public SpriteBatch batch;
	@Override
	public void create() {
		batch = new SpriteBatch();
		setScreen(new GameScreen(this));
	}

	@Override
	public void dispose() {

	}

	@Override
	public void render() {

		super.render();
	}
}
