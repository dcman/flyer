package com.fancylancy.flyergame.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.fancylancy.flyergame.items.images.Button;
import com.fancylancy.flyergame.items.images.HeaderImage;
import com.fancylancy.flyergame.items.images.LargeTextImage;
import com.fancylancy.flyergame.items.images.SmallTextImage;

/**
 * Created by SuckIt on 6/21/15.
 * Screen for IATA quiz
 */
public class IATAScreen extends BaseScreen {
    private HeaderImage headerImage;
    private SmallTextImage time;
    private SmallTextImage score;
    private LargeTextImage city;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;

    public IATAScreen(Game game) {
        super(game);
        TAG = IATAScreen.class.getName();
        headerImage = new HeaderImage(0f, 442f);
        city = new LargeTextImage(67f, 465f);
        time = new SmallTextImage(289f, 678f);
        score = new SmallTextImage(30f, 678f);
        b1 = new Button(5f, 350f);
        b2 = new Button(5f, 263f);
        b3 = new Button(5f, 176f);
        b4 = new Button(5f, 89f);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        camera.update();
        Gdx.gl.glClearColor(182 / 255f, 182 / 255f, 182 / 255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);
        headerImage.render(delta);
        city.render(delta);
        time.render(delta);
        score.render(delta);
        b1.render(delta);
        b2.render(delta);
        b3.render(delta);
        b4.render(delta);
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
