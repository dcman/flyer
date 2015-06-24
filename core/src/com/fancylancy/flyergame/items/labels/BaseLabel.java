package com.fancylancy.flyergame.items.labels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/21/15.
 * Base for some labels
 */
public class BaseLabel implements Disposable {
    protected static String TAG;
    protected String label;
    protected float x, sX, width;
    protected float y, sY, height;
    protected float size;
    protected SpriteBatch batch;
    protected BitmapFont text;
    protected BitmapFont subText;
    protected boolean shadow;
    protected GlyphLayout glyphLayout;

    public BaseLabel(float x, float y, float height, float width, String label) {
        this.label = label;
        this.batch = Assets.getInstance().getBatch();
        this.height = height;
        this.width = width;
    }

    public void render(float delta) {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isShadow() {
        return shadow;
    }

    public void setShadow(boolean shadow) {
        this.shadow = shadow;
    }

    @Override
    public void dispose() {
        Gdx.app.debug(TAG, " Disposing...");
        text.dispose();
        subText.dispose();
    }
}
