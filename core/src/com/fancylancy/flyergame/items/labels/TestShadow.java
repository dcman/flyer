package com.fancylancy.flyergame.items.labels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/21/15.
 */
public class TestShadow extends BaseLabel {
    public TestShadow(float x, float y) {
        this.x = x - 4;
        this.y = y - 4;
        font = new BitmapFont(Gdx.files.internal("Roboto-Black-56.fnt"), false);
        font.setColor(0, 0, 0, .25f);
        label = "This Is a Test!!!!";
        batch = Assets.getInstance().getBatch();

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        font.draw(batch, label, x + 5, y + font.getXHeight() * 2.25f);
    }
}
