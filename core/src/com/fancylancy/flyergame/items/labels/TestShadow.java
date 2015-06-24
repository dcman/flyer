package com.fancylancy.flyergame.items.labels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/21/15.
 */
public class TestShadow extends BaseLabel {
    public TestShadow(float x, float y, float height, float width, String label) {
        super(x - 4, y - 4, height, width, label);
        subText = new BitmapFont(Gdx.files.internal("Roboto-Black-56.fnt"), false);
        subText.setColor(0, 0, 0, .25f);
        batch = Assets.getInstance().getBatch();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        subText.draw(batch, label, x + 5, y + subText.getXHeight() * 2.25f);
    }
}
