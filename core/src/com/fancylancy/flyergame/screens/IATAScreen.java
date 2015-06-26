package com.fancylancy.flyergame.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.fancylancy.flyergame.items.images.Button;
import com.fancylancy.flyergame.items.images.HeaderImage;
import com.fancylancy.flyergame.items.images.LargeTextImage;
import com.fancylancy.flyergame.items.images.SmallTextImage;
import com.fancylancy.flyergame.utils.Assets;

import java.util.Random;


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
    private String winner;
    private Random ran;
    private int pos;
    private int neg;

    public IATAScreen(Game game) {
        super(game);
        TAG = IATAScreen.class.getName();
        pos = 0;
        neg = 0;
        ran = new Random(System.currentTimeMillis());
        Gdx.app.debug(TAG, " Created");
        headerImage = new HeaderImage(0f, 442f);
        city = new LargeTextImage(67f, 465f);
        time = new SmallTextImage(289f, 678f);
        time.setLabel("" + pos);
        score = new SmallTextImage(30f, 678f);
        score.setLabel("" + neg);
        b1 = new Button(5f, 350f, this);
        b2 = new Button(5f, 263f, this);
        b3 = new Button(5f, 176f, this);
        b4 = new Button(5f, 89f, this);
        setGame();
    }

    public void setGame() {
        list = Assets.getInstance().list();
        int tmp = ran.nextInt(list.size());
        city.setLabel(list.get(tmp).getCity());
        b1.setLabel(list.get(0).getIata());
        b2.setLabel(list.get(1).getIata());
        b3.setLabel(list.get(2).getIata());
        b4.setLabel(list.get(3).getIata());
        winner = list.get(tmp).getIata();

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
        pressHandel();
    }

    private void pressHandel() {
        if (Gdx.input.isKeyPressed(Input.Keys.R)) {
            setGame();
        }
    }

    public void scoreUpdate() {
        time.setLabel("" + pos);
        score.setLabel("" + neg);

    }

    public String getWinner() {
        return winner;
    }

    public int getNeg() {
        return neg;
    }

    public void setNeg(int neg) {
        this.neg = neg;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public void dispose() {
        super.dispose();
        Gdx.app.debug(TAG, " Disposing...");
        headerImage.dispose();
        city.dispose();
        time.dispose();
        score.dispose();
        b1.dispose();
        b2.dispose();
        b3.dispose();
        b4.dispose();
    }
}
