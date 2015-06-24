package com.fancylancy.flyergame.items.images;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.fancylancy.flyergame.items.labels.UniLabel;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/21/15.
 * Clickable buttons whit text
 */
public class Button extends BaseImageItem {
    private TextureRegion normal;
    private TextureRegion pressed;
    private boolean isPressed;
    private UniLabel uniLabel;


    public Button(float x, float y) {
        this.x = x;
        this.y = y;
        TAG = Button.class.getName();
        isPressed = false;
        atlas = Assets.getInstance().getAtlas();
        batch = Assets.getInstance().getBatch();
        pressed = atlas.findRegion("Pressed");
        normal = atlas.findRegion("Normal");
        bounds = new Rectangle(x, y, normal.getRegionWidth(), normal.getRegionHeight());
        shapeRenderer = new ShapeRenderer();
        uniLabel = new UniLabel(x, y, normal.getRegionHeight(), normal.getRegionWidth(), label);
    }

    public void init(String label) {
        uniLabel.init(x, y, label);
    }
    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        if (isPressed) {
            batch.draw(pressed, x, y);
        }
        if (!isPressed) {
            batch.draw(normal, x, y);
        }
        uniLabel.render(delta);
        batch.end();
        clickHandler();
    }

    @Override
    protected void clicked() {
        isPressed ^= true;
        uniLabel.setShadow(!uniLabel.isShadow());
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
