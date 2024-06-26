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
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private TmxMapLoader mapLoader;
    public GameScreen(TankGame game) {
        this.game = game;
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(Constants.VIEWPORT_WIDTH, Constants.VIEWPORT_HEIGHT, gamecam);
        stage = new GameStage();
        hud = new HUD(game.batch);
/*
        gamecam.setToOrtho(false,Constants.VIEWPORT_WIDTH,Constants.VIEWPORT_HEIGHT);
        mapLoader = new TmxMapLoader();
        map = mapLoader.load("maps/stage/mapsMain.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        gamecam.position.set((float)gamePort.getScreenWidth()/2,(float)gamePort.getScreenHeight()/2,0);
 */
    }

    /*
    public void HandleInput(float deltaTime)
    {
        if(Gdx.input.isTouched())
        {
            gamecam.position.x += 100 * deltaTime;
        }
    }

    public void update(float deltaTime)
    {
        HandleInput(deltaTime);
        renderer.setView(gamecam);
        gamecam.update();
    }
    */

    @Override
    public void render(float delta) {
        //update(delta);
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //renderer.render();
        gamecam.update();
        renderer.setView(gamecam);
        renderer.render();
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
        renderer.dispose();
        map.dispose();
    }
}
