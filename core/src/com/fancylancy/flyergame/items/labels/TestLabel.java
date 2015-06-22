package com.fancylancy.flyergame.items.labels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/21/15.
 */
public class TestLabel extends BaseLabel {

    public TestLabel(float x, float y) {
        this.x = x;
        this.y = y;
        font = new BitmapFont(Gdx.files.internal("Roboto-Black-56.fnt"), false);
        font.setColor(Color.BLACK);
        label = "This Is a Test!!!!";
        batch = Assets.getInstance().getBatch();

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        font.draw(batch, label, x + 5, y + font.getXHeight() * 2.25f);
        batch.end();
    }
}
