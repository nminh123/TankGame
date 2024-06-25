package com.nminh123.tankgame.stages;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;
import com.nminh123.tankgame.utils.Constants;

public class GameStage extends Stage {
    private static final int VIEWPORT_WIDTH = Constants.VIEWPORT_WIDTH;
    private static final int VIEWPORT_HEIGHT = Constants.VIEWPORT_HEIGHT;
    private OrthographicCamera _camera;

    public GameStage()
    {
        SetupCamera();
    }
    private void SetupCamera()
    {
        _camera = new OrthographicCamera(VIEWPORT_WIDTH,VIEWPORT_HEIGHT);
        _camera.position.set(_camera.viewportWidth,_camera.viewportHeight,0f);
        _camera.update();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
