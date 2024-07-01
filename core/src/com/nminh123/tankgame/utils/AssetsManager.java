package com.nminh123.tankgame.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import com.nminh123.tankgame.MapLoader;

public class AssetsManager {
    public AssetManager manager;
    public TextureAtlas textureAtlasSpriteGame;
    public Skin skinStyle;
    public BitmapFont font;
    public MapLoader maploader;
    public static JsonValue jsonDataGunA, jsonDataGunB,
            jsonDataHull, jsonDataTrack, jsonDataShell, jsonDataEnemy;
    public static JsonValue jsonMenu, jsonSetting, jsonModeGame,
            jsonShop, jsonHanger, jsonBonus, jsonSelectStage,
            jsonHelp, jsonCredits,jsonDialoge;
    public static JsonValue valueBonus, valueNiveu;
    public static TextureRegion backgroundPlan1,backgroundPlan2;
    public static TextureRegion KillIcon;
    public static Animation<TextureRegion> animationBombExplosionA;
    public static Animation<TextureRegion> animationBombExplosionB;
    public static Animation<TextureRegion> animationBombExplosionC;
    public static Animation<TextureRegion> animationBombIdleA;
    public static Animation<TextureRegion> animationBombIdleB;
    public static Animation<TextureRegion> animationBombIdleC;
    public static Animation<TextureRegion> animationBombTrigerringA;
    public static Animation<TextureRegion> animationBombTrigerringB;
    public static Animation<TextureRegion> animationBombTrigerringC;
    public static Animation<TextureRegion> animationCanonFiring;
    public static TextureRegion Light1, Light2, Light3;
    public static Animation<TextureRegion> animationArrow;
    public static Animation<TextureRegion> animationArrowA;
    public static Animation<TextureRegion> animationAuraFinal;
    public static Animation<TextureRegion> animationAura;
    public static Animation<TextureRegion> animationBlueishFlame;
    public static Animation<TextureRegion> animationBlueishFlameUp;
    public static Animation<TextureRegion> animationBlueishSmoke;
    public static Animation<TextureRegion> animationBlueishSmokeUp;
    public static Animation<TextureRegion> animationFireSmoke;
    public static Animation<TextureRegion> animationFireSmokeUp;
    public static Animation<TextureRegion> animationFire;
    public static Animation<TextureRegion> animationFireUp;
    public static Animation<TextureRegion> animationImpactAAsteroidA;
    public static Animation<TextureRegion> animationImpactBAsteroidB;
    public static Animation<TextureRegion> animationImpactCAsteroidC;
    public static Animation<TextureRegion> animationMagic;
    public static Animation<TextureRegion> animationMagicUp;
    public static Animation<TextureRegion> animationMuzzle;
    public static Animation<TextureRegion> animationShipDeath;
    public static Animation<TextureRegion> animationSmoke;
    public static Animation<TextureRegion> animationSpriteEffectExhaust00;
    public static Animation<TextureRegion> animationSpriteEffectExhaust01;
    public static Animation<TextureRegion> animationSpriteEffectExhaust02;
    public static Animation<TextureRegion> animationSpriteEffectExplosion;
    public static Animation<TextureRegion> animationSpriteFireShotsFlame;
    public static Animation<TextureRegion> animationSpriteFireShotsImpactA;
    public static Animation<TextureRegion> animationSpriteFireShotsImpactB;
    public static Animation<TextureRegion> animationSpriteFireShotsShotA;
    public static Animation<TextureRegion> animationSpriteFireShotsShotB;
    public static Animation<TextureRegion> animationStarA;
    public static Animation<TextureRegion> animationStarB;
    public static Animation<TextureRegion> animationStarC;


    public AssetsManager()
    {
        manager = new AssetManager();
    }

    public void LoadAsset()
    {
        manager = new AssetManager();
        manager.load("Sprite/SpriteGame.png",TextureAtlas.class);
        manager.load("skins/GameStyle.json", Skin.class);
        manager.load("skins/jf_flat.fnt", BitmapFont.class);
    }

    public void SpriteManager()
    {
        textureAtlasSpriteGame = manager.get(Constants.AtlasSpriteGame,TextureAtlas.class);
        LoadBackGround();
        LoadBomb();
        LoadEffects();
    }

    public void LoadMenuGame()
    {
        skinStyle = manager.get(Constants.JsonGameStyle, Skin.class);
        JsonReader jsonReader = new JsonReader();
        JsonValue Valuedata = jsonReader.parse(Gdx.files.internal(Constants.JsoncrachType));

        jsonDataGunA = Valuedata.get("GunA");
        jsonDataGunB = Valuedata.get("GunB");
        jsonDataHull = Valuedata.get("Hull");
        jsonDataTrack = Valuedata.get("Track");
        jsonDataShell = Valuedata.get("Shell");
        jsonDataEnemy = Valuedata.get("crach");

        JsonValue valueLanguage = jsonReader.parse
                (Gdx.files.internal(Constants.JsonTraduction));

        jsonMenu = valueLanguage.get("Menu");
        jsonSetting = valueLanguage.get("Setting");
        jsonModeGame = valueLanguage.get("ModeGame");
        jsonShop = valueLanguage.get("Shop");
        jsonHanger = valueLanguage.get("Hanger");
        jsonBonus = valueLanguage.get("Bonus");
        jsonSelectStage = valueLanguage.get("Select_stage");
        jsonHelp = valueLanguage.get("Help");
        jsonCredits = valueLanguage.get("credits");
        jsonDialoge = valueLanguage.get("dialoge");

        valueBonus = jsonReader.parse(Gdx.files.internal(Constants.JsonbonusValue));
        valueNiveu = jsonReader.parse(Gdx.files.internal(Constants.JsonvalueNive));

        font = manager.get(Constants.fontt, BitmapFont.class);
        font.getData().setScale(0.2f);

        maploader = new MapLoader();
    }

    public void LoadBackGround()
    {
        String Folder = "background/";
        backgroundPlan1 = textureAtlasSpriteGame.findRegion(Folder + "planet-1");
        backgroundPlan2 = textureAtlasSpriteGame.findRegion(Folder + "planet-2");
    }

    public void LoadBomb()
    {
        String Folder = "Bombs/";
        animationBombExplosionA = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Bomb_Explosion_A"));
        animationBombExplosionB = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Bomb_Explosion_B"));
        animationBombExplosionC = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Bomb_Explosion_C"));

        animationBombIdleA = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Bomb_Idle_A"));
        animationBombIdleB = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Bomb_Idle_B"));
        animationBombIdleC = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Bomb_Idle_C"));

        animationBombTrigerringA = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Bomb_Triggering_A"));
        animationBombTrigerringB = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Bomb_Triggering_C"));
        animationBombTrigerringC = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Bomb_Triggering_C"));

        animationCanonFiring = new Animation<>(Constants.frameDuration,
                textureAtlasSpriteGame.findRegions(Folder + "cannon-firing"));

        Light1 = textureAtlasSpriteGame.findRegion(Folder + "Light", 1);
        Light2 = textureAtlasSpriteGame.findRegion(Folder + "Light", 2);
        Light3 = textureAtlasSpriteGame.findRegion(Folder + "Light", 3);
    }

    public void LoadEffects()
    {
        String Folder = "Effects/";
        animationArrowA = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "arrow-a"));
        animationArrow = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "arrow"));
        animationAuraFinal = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "aura-final"));
        animationAura = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "aura"));
        animationBlueishFlame = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "blueish_flame"));
        animationBlueishFlameUp = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "blueish_flame_up"));
        animationBlueishSmoke = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "blueish_smoke"));
        animationBlueishSmokeUp = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "blueish_smoke_up"));
        animationFireSmoke = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "fire+smoke"));
        animationFireSmokeUp = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "fire+smoke_up"));
        animationFire = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "fire"));
        animationFireUp = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "fire_up"));
        animationImpactAAsteroidA = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "ImpactA/impact-asteroid-a"));
        animationImpactBAsteroidB = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "ImpactB/impact-asteroid-b"));
        animationImpactCAsteroidC = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "ImpactC/impact-asteroid-c"));
        animationMagic = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "magic"));
        animationMagicUp = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "magic_up"));
        animationMuzzle = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "muzzle"));
        animationShipDeath = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "ship-death"));
        animationSmoke = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "smoke"));
        animationSpriteEffectExhaust00 = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Sprite_Effects_Exhaust_00"));
        animationSpriteEffectExhaust01 = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Sprite_Effects_Exhaust_01"));
        animationSpriteEffectExhaust02 = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Sprite_Effects_Exhaust_02"));
        animationSpriteEffectExplosion = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Sprite_Effects_Explosion"));
        animationSpriteFireShotsFlame = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Sprite_Fire_Shots_Flame"));
        animationSpriteFireShotsImpactA = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Sprite_Fire_Shots_Impact_A"));
        animationSpriteFireShotsImpactB = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Sprite_Fire_Shots_Impact_B"));
        animationSpriteFireShotsShotA = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Sprite_Fire_Shots_Shot_A"));
        animationSpriteFireShotsShotB = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "Sprite_Fire_Shots_Shot_B"));
        animationStarA = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "stara"));
        animationStarB = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "starb"));
        animationStarC = new Animation<>(Constants.EframeDuration,
                textureAtlasSpriteGame.findRegions(Folder + "starc"));

        KillIcon = textureAtlasSpriteGame.findRegion(Folder + "Kill_Icon");
    }
}
