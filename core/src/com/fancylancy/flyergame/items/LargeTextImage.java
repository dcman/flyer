package com.fancylancy.flyergame.items;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/21/15.
 */
public class LargeTextImage extends BaseImageItem {
    public LargeTextImage(float x, float y) {
        TAG = LargeTextImage.class.getName();
        this.x = x;
        this.y = y;
        batch = Assets.getInstance().getBatch();
        shapeRenderer = new ShapeRenderer();
        atlas = Assets.getInstance().getAtlas();
        textureRegion = atlas.findRegion("LargeText");
        bounds = new Rectangle(x, y, textureRegion.getRegionWidth(), textureRegion.getRegionHeight());
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        batch.draw(textureRegion, x, y);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
