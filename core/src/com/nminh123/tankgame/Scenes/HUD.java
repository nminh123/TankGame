package com.nminh123.tankgame.Scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nminh123.tankgame.utils.Constants;

public class HUD {
    public Stage stage;
    private Viewport viewport;
    private int timer;
    private int score;
    Label ScoreLabel;
    Label TimeLabel;

    public HUD(SpriteBatch sb)
    {
        score = 0;
        timer = 300;

        viewport = new FitViewport(Constants.VIEWPORT_WIDTH,Constants.VIEWPORT_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport,sb);

        Table table = new Table();
        table.top();
        table.setFillParent(true);

        ScoreLabel = new Label(String.format("Time: %d", timer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        TimeLabel = new Label(String.format("Score: %d",score), new Label.LabelStyle(new BitmapFont(),Color.WHITE));

        table.add(TimeLabel).expandX().padTop(10);
        table.add(ScoreLabel).expandX().padRight(10);

        stage.addActor(table);
    }

}
