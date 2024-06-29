package com.nminh123.tankgame.GameWorlds;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nminh123.tankgame.Levels.Level_1;
import com.nminh123.tankgame.utils.AssetsManager;


public class TankGame extends Game {

	public SpriteBatch batch;
	AssetsManager am = new AssetsManager();
	@Override
	public void create() {
		batch = new SpriteBatch();
		setScreen(new GameScreen(this));
		am.SpriteManager();
	}

	@Override
	public void dispose() {

	}

	@Override
	public void render() {

		super.render();
	}
}
