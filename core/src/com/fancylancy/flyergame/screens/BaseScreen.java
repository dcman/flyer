package com.fancylancy.flyergame.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Disposable;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/16/15.
 * Basic functions for a screen
 */
public abstract class BaseScreen extends ScreenAdapter implements Disposable {
    protected static String TAG;
    protected OrthographicCamera camera;
    protected Game game;
    protected Assets assets;
    protected Rectangle bounds;
    protected SpriteBatch batch;

    public BaseScreen(Game game) {
        this.game = game;
        this.camera = Assets.getInstance().getCamera();
        this.assets = Assets.getInstance();
        this.batch = Assets.getInstance().getBatch();
        this.bounds = new Rectangle(0, 0, Assets.getScreenWidth(), Assets.getScreenHeight());
    }

    protected void clickHandler() {
        if (Gdx.input.justTouched()) {
            Vector3 touch = new Vector3();
            Assets.getInstance().getCamera().unproject(touch.set(Gdx.input.getX(), Gdx.input.getY(), 0));
            if (bounds.contains(touch.x, touch.y)) {
                Gdx.app.debug(TAG, " Someone touched me");
                clicked();
            }
        }
    }

    protected void clicked() {
    }

    @Override
    public void dispose() {
        super.dispose();
        Gdx.app.debug(TAG, " Disposing...");
        assets.dispose();
        game.dispose();
    }
}
