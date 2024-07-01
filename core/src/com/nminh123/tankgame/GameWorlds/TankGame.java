package com.nminh123.tankgame.GameWorlds;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nminh123.tankgame.Scenes.GameScreen;
import com.nminh123.tankgame.utils.AssetsManager;


public class TankGame extends Game {

	public SpriteBatch batch;
	AssetsManager am = new AssetsManager();
	@Override
	public void create() {
		batch = new SpriteBatch();
		setScreen(new GameScreen());
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
