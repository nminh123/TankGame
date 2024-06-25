package com.nminh123.tankgame.GameWorlds;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nminh123.tankgame.Scenes.HUD;
import com.nminh123.tankgame.stages.GameStage;
import com.nminh123.tankgame.utils.Constants;

public class GameScreen implements Screen {
    private OrthographicCamera cam;
    TankGame game;
    private GameStage stage;
    private HUD hud;
    private Viewport viewport;
    public GameScreen(TankGame game) {
        this.game = game;
        viewport = new FitViewport(Constants.VIEWPORT_WIDTH, Constants.VIEWPORT_HEIGHT, cam);
        stage = new GameStage();
        hud = new HUD(game.batch);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
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
