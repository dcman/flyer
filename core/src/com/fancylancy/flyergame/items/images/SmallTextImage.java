package com.fancylancy.flyergame.items.images;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/21/15.
 * Small text box
 */
public class SmallTextImage extends BaseImageItem {
    public SmallTextImage(float x, float y) {
        this.x = x;
        this.y = y;
        TAG = SmallTextImage.class.getName();
        Gdx.app.debug(TAG, " Created");
        batch = Assets.getInstance().getBatch();
        shapeRenderer = new ShapeRenderer();
        atlas = Assets.getInstance().getAtlas();
        textureRegion = atlas.findRegion("SmallText");
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
        Gdx.app.debug(TAG, " Disposing...");
        shapeRenderer.dispose();
    }
}
