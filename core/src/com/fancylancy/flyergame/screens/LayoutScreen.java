package com.fancylancy.flyergame.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.fancylancy.flyergame.items.LayoutImage;

/**
 * Created by SuckIt on 6/19/15.
 */
public class LayoutScreen extends BaseScreen {
    private LayoutImage layoutImage;

    public LayoutScreen(Game game) {
        super(game);
        TAG = LayoutScreen.class.getName();
        Gdx.app.debug(TAG, " Created");
        layoutImage = new LayoutImage();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        camera.update();
        Gdx.gl.glClearColor(182 / 255f, 182 / 255f, 182 / 255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(assets.getCamera().combined);
        layoutImage.render(delta);

    }

    @Override
    public void dispose() {
        super.dispose();
        Gdx.app.debug(TAG, " Disposing...");
    }
}
