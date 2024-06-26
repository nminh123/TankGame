package com.nminh123.tankgame;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileSet;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.maps.ImageResolver;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Array;
public class MapLoader extends TmxMapLoader implements Disposable
{
    ImageResolver imageResolver;
    ObjectMap<String, Texture> textures;
    ObjectMap<String, TiledMap> maps;
    Parameters parameter;
    TiledMapTileSet tileSet;

    public MapLoader()
    {
        super();
        parameter = new Parameters();
        FileHandle tmxFile = resolve("maps/stage/mapsMain.tmx");

        this.root = xml.parse(tmxFile);
        this.textures = new ObjectMap<>();
        this.maps = new ObjectMap<>();
        Array<FileHandle> textureFiles = getDependencyFileHandles(tmxFile);
        for(FileHandle textureFile : textureFiles)
        {
            Texture texture = new Texture(textureFile, parameter.generateMipMaps);
            texture.setFilter(parameter.textureMinFilter,parameter.textureMagFilter);
            textures.put(textureFile.path(),texture);
        }
    }
    @Override
    public void dispose() {

    }
}
