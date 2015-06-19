package com.fancylancy.flyergame.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.fancylancy.flyergame.items.TestImage;

/**
 * Created by SuckIt on 6/16/15.
 */
public class TestScreen extends BaseScreen {
    private TestImage testImage;
    private float zoom = 100;
    public TestScreen(Game game) {
        super(game);
        TAG = TestScreen.class.getName();
        Gdx.app.debug(TAG, " Created");
        testImage = new TestImage();
        camera.zoom = zoom;
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        assets.getCamera().update();
        Gdx.gl.glClearColor(.99f, .99f, .99f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        assets.getBatch().setProjectionMatrix(assets.getCamera().combined);
        testImage.render(delta);
        clickHandler();
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
