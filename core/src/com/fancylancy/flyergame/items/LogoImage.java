package com.fancylancy.flyergame.items;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/17/15.
 * Logo Image
 */
public class LogoImage extends BaseImageItem {

    public LogoImage() {
        TAG = LogoImage.class.getName();
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

    }
}
