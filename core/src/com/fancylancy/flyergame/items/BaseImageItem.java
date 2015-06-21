package com.fancylancy.flyergame.items;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Disposable;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/16/15.
 */
public class BaseImageItem implements Disposable {
    protected static String TAG;
    protected TextureRegion textureRegion;
    protected Texture texture;
    protected SpriteBatch batch;
    protected Rectangle bounds;
    protected float textureHalfWidth;
    protected float textureHalfHeight;
    protected float worldHalfWidth = Assets.getScreenWidth() / 2;
    protected float worldHalfHeight = Assets.getScreenHeight() / 2;
    protected ShapeRenderer shapeRenderer;

    public BaseImageItem() {

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

    private void clicked() {
    }

    public void render(float delta) {
        if (Gdx.app.getLogLevel() == 3) {
            shapeRenderer.setProjectionMatrix(Assets.getInstance().getCamera().combined);
            shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
            shapeRenderer.setColor(1, 1, 0, 1);
            shapeRenderer.rect(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
            shapeRenderer.end();
        }
    }

    @Override
    public void dispose() {

    }
}
