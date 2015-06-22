package com.fancylancy.flyergame.items;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/21/15.
 * Header image
 */
public class HeaderImage extends BaseImageItem {
    public HeaderImage(float x, float y) {
        this.x = x;
        this.y = y;
        TAG = HeaderImage.class.getName();
        batch = Assets.getInstance().getBatch();
        shapeRenderer = new ShapeRenderer();
        atlas = Assets.getInstance().getAtlas();
        textureRegion = atlas.findRegion("Header");
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
