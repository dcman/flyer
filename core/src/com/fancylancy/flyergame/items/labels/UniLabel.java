package com.fancylancy.flyergame.items.labels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

/**
 * Created by SuckIt on 6/23/15.
 */
public class UniLabel extends BaseLabel {
    public UniLabel(float x, float y, float height, float width, String label) {
        super(x, y, height, width, label);
        TAG = UniLabel.class.getName();
        text = new BitmapFont(Gdx.files.internal("Roboto-Black-56.fnt"), false);
        text.setColor(33 / 255, 33 / 255, 33 / 255, 1);
        subText = new BitmapFont(Gdx.files.internal("Roboto-Black-56.fnt"), false);
        subText.setColor(33 / 255, 33 / 255, 33 / 255, 0.25f);
        init(x, y, label);
    }

    public void init(float x, float y, String label) {
        this.label = label;
        glyphLayout = new GlyphLayout(text, label);
        this.x = (x + width / 2) - (glyphLayout.width / 2);
        this.y = (y + height / 2) + (glyphLayout.height / 2);
        sX = this.x - 4f;
        sY = this.y - 4f;
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        if (shadow) {
            subText.draw(batch, label, sX, sY);
            text.draw(batch, label, x, y);
        } else {
            text.draw(batch, label, x, y);
        }
    }

    @Override
    public void dispose() {
        super.dispose();
        Gdx.app.debug(TAG, " Disposing...");
        text.dispose();
        subText.dispose();
    }
}
