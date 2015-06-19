package com.fancylancy.flyergame.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.fancylancy.flyergame.items.LogoImage;

/**
 * Created by SuckIt on 6/16/15.
 * Logo Screen
 */
public class LogoScreen extends BaseScreen {
    private LogoImage logoImage;
    private float zoom = 100;
    private float clickWaitTime = 3;

    public LogoScreen(Game game) {
        super(game);
        TAG = LogoScreen.class.getName();
        Gdx.app.debug(TAG, " Created");
        logoImage = new LogoImage();
        camera.zoom = zoom;
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        assets.getCamera().update();
        Gdx.gl.glClearColor(.99f, .99f, .99f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        assets.getBatch().setProjectionMatrix(assets.getCamera().combined);
        logoImage.render(delta);
        if (clickWaitTime > 0) {
            clickWaitTime = clickWaitTime - 1;
        } else clickHandler();
        if (zoom > 0) {
            camera.zoom = zoom;
            zoom = zoom - 1;
        }
    }

    @Override
    public void dispose() {
        super.dispose();
        Gdx.app.debug(TAG, " Disposing...");
    }
}
