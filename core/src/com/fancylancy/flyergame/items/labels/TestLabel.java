package com.fancylancy.flyergame.items.labels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/21/15.
 */
public class TestLabel extends BaseLabel {
    public TestLabel(float x, float y, float height, float width, String label) {
        super(x, y, height, width, label);
        text = new BitmapFont(Gdx.files.internal("Roboto-Black-56.fnt"), false);
        text.setColor(Color.BLACK);
        batch = Assets.getInstance().getBatch();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        text.draw(batch, label, x + 5, y + text.getXHeight() * 2.25f);
    }
}
