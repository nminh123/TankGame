package com.nminh123.tankgame.utils;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class AssetsManager {
    private TextureAtlas textureAtlas;

    public void LoadAsset()
    {
        textureAtlas = new TextureAtlas(Constants.SPRITES_ATLAS_PATH);
    }
}
