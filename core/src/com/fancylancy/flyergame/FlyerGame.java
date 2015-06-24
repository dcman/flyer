package com.fancylancy.flyergame;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.fancylancy.flyergame.screens.LogoScreen;
import com.fancylancy.flyergame.utils.Assets;

public class FlyerGame extends Game {
    private final static String TAG = FlyerGame.class.getName();
    public Assets assets;
    LogoScreen logoScreen;

    @Override
    public void create() {
        logoScreen = new LogoScreen(this);
        assets = Assets.getInstance();
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        setScreen(logoScreen);

    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.debug(TAG, " Resize: " + width + "X" + height);
        super.resize(width, height);
    }

    public Assets getAssets() {
        return assets;
    }

    @Override
    public void dispose() {
        super.dispose();
        Gdx.app.debug(TAG, " Disposing...");
        assets.dispose();
        logoScreen.dispose();
    }
}
