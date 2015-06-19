package com.fancylancy.flyergame.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.fancylancy.flyergame.items.TestImage;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/16/15.
 */
public class TestScreen extends BaseScreen {
    private TestImage testImage;

    public TestScreen(Game game) {
        super(game);
        TAG = TestScreen.class.getName();
        Gdx.app.debug(TAG, " Created");
        testImage = new TestImage();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        assets.getCamera().update();
        Gdx.gl.glClearColor(.5f, .5f, .5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        assets.getBatch().setProjectionMatrix(assets.getCamera().combined);
        testImage.render(delta);
        clickHandler();
        shapeRenderer.setProjectionMatrix(Assets.getInstance().getCamera().combined);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(1, 1, 0, 1);
        shapeRenderer.rect(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        Gdx.app.debug(TAG, " Disposing...");
    }
}
