package com.nminh123.tankgame.Levels;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;

import com.nminh123.tankgame.GameWorlds.TankGame;
import com.nminh123.tankgame.utils.Constants;

public class Level_1 implements Screen {
    private TankGame tankGame;
    private OrthographicCamera _cam;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    public Level_1(TankGame tankGame) {
        this.tankGame = tankGame;
    }

    @Override
    public void show() {
		_cam = new OrthographicCamera();
		_cam.setToOrtho(false, Constants.VIEWPORT_WIDTH,Constants.VIEWPORT_HEIGHT);

		map = new TmxMapLoader().load("maps/stage/stage1.tmx");

		renderer = new OrthogonalTiledMapRenderer(map);
    }

    @Override
    public void render(float delta) {
        _cam.update();
		renderer.setView(_cam);
		renderer.render();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        map.dispose();
        renderer.dispose();
    }
}
