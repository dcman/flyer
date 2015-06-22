package com.fancylancy.flyergame.items.labels;

import com.badlogic.gdx.utils.Disposable;

/**
 * Created by SuckIt on 6/21/15.
 * Base for some labels
 */
public class BaseLabel implements Disposable {
    protected static String TAG;
    protected String label;
    protected float x;
    protected float y;
    protected float size;

    public BaseLabel() {
    }

    protected void render(float delta) {
    }

    @Override
    public void dispose() {

    }
}
