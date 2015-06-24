package com.fancylancy.flyergame.items.images;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/17/15.
 * Logo Image
 */
public class LogoImage extends BaseImageItem {
    private float textureHalfWidth;
    private float textureHalfHeight;
    private float worldHalfWidth = Assets.getScreenWidth() / 2;
    private float worldHalfHeight = Assets.getScreenHeight() / 2;

    public LogoImage() {
        TAG = LogoImage.class.getName();
        Gdx.app.debug(TAG, " Created");
        textureRegion = Assets.getInstance().getRegion();
        batch = Assets.getInstance().getBatch();
        textureHalfHeight = textureRegion.getRegionHeight() / 2;
        textureHalfWidth = textureRegion.getRegionWidth() / 2;
        shapeRenderer = new ShapeRenderer();
        bounds = new Rectangle(worldHalfWidth - textureHalfWidth, worldHalfHeight - textureHalfHeight,
                textureRegion.getRegionWidth(), textureRegion.getRegionHeight());
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        batch.draw(textureRegion, worldHalfWidth - textureHalfWidth, worldHalfHeight - textureHalfHeight);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        Gdx.app.debug(TAG, " Disposing...");
        shapeRenderer.dispose();
    }
}
