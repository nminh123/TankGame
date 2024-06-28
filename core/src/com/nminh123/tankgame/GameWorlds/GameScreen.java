package com.nminh123.tankgame.GameWorlds;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import com.nminh123.tankgame.Scenes.HUD;
import com.nminh123.tankgame.stages.GameStage;
import com.nminh123.tankgame.utils.Constants;

public class GameScreen implements Screen {
    private OrthographicCamera gamecam;
    TankGame game;
    private GameStage stage;
    private HUD hud;
    private Viewport gamePort;
    public GameScreen(TankGame game) {
        this.game = game;
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(Constants.VIEWPORT_WIDTH, Constants.VIEWPORT_HEIGHT, gamecam);
        stage = new GameStage();
        hud = new HUD(game.batch);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
    }

    @Override
    public void show() {

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

    }
}
