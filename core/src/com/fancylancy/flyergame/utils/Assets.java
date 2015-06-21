package com.fancylancy.flyergame.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by SuckIt on 6/16/15.
 * Assets manager
 */
public class Assets extends AssetManager implements Disposable {
    private static final String TAG = AssetManager.class.getName();
    private static final float screenWidth = 480;
    private static final float screenHeight = 800;
    private static Assets ourInstance = new Assets();
    private SpriteBatch batch;
    private Texture img;
    private OrthographicCamera camera;
    private Viewport viewport;
    private TextureAtlas atlas;
    private TextureRegion region;

    private Assets() {
        camera = new OrthographicCamera(screenWidth, screenHeight);
        camera.position.set(screenWidth / 2, screenHeight / 2, 0);
        viewport = new FitViewport(screenWidth, screenHeight, camera);
        camera.setToOrtho(false, viewport.getWorldWidth(), viewport.getWorldHeight());
        batch = new SpriteBatch();
        img = new Texture("libGDX.png");
        atlas = new TextureAtlas("Flyer.pack");
        region = atlas.findRegion("libGDX");
    }

    public static Assets getInstance() {
        return ourInstance;
    }

    public static float getScreenWidth() {
        return screenWidth;
    }

    public static float getScreenHeight() {
        return screenHeight;
    }

    public TextureRegion getRegion() {
        return region;
    }

    public Viewport getViewport() {
        return viewport;
    }

    public OrthographicCamera getCamera() {
        return camera;
    }

    public Texture getImg() {
        return img;
    }

    public SpriteBatch getBatch() {
        return batch;
    }

    @Override
    public synchronized void dispose() {
        super.dispose();
        Gdx.app.debug(TAG, " Disposing...");
        img.dispose();
        batch.dispose();
        atlas.dispose();
    }
}
