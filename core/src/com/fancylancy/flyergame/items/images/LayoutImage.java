package com.fancylancy.flyergame.items.images;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/19/15.
 * Test of what the layout could look like
 */
public class LayoutImage extends BaseImageItem {
    private float textureHalfWidth;
    private float textureHalfHeight;
    private float worldHalfWidth = Assets.getScreenWidth() / 2;
    private float worldHalfHeight = Assets.getScreenHeight() / 2;

    public LayoutImage() {
        texture = new Texture("flyerlayout.png");
        TAG = LayoutImage.class.getName();
        batch = Assets.getInstance().getBatch();
        textureHalfHeight = texture.getHeight() / 2;
        textureHalfWidth = texture.getWidth() / 2;
        shapeRenderer = new ShapeRenderer();
        bounds = new Rectangle(worldHalfWidth - textureHalfWidth, worldHalfHeight - textureHalfHeight, texture.getWidth(), texture.getHeight());
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        batch.draw(texture, worldHalfWidth - textureHalfWidth, worldHalfHeight - textureHalfHeight);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();

    }
}
