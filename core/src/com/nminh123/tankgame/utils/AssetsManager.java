package com.nminh123.tankgame.utils;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.HashMap;

public class AssetsManager {
    private static HashMap<String, TextureRegion> texturemap = new HashMap<>();
    private TextureAtlas textureAtlas;

    public void LoadAsset()
    {
        textureAtlas = new TextureAtlas(Constants.SPRITES_ATLAS_PATH);
    }
}
