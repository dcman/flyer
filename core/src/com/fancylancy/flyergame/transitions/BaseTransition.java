package com.fancylancy.flyergame.transitions;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.Disposable;
import com.fancylancy.flyergame.utils.Assets;

/**
 * Created by SuckIt on 6/18/15.
 */
public class BaseTransition implements Disposable {
    protected OrthographicCamera camera;
    protected float zoom;

    public BaseTransition() {
        camera = Assets.getInstance().getCamera();
    }

    @Override
    public void dispose() {

    }
}
