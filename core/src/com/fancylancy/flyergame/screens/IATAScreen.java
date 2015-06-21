package com.fancylancy.flyergame.screens;

import com.badlogic.gdx.Game;
import com.fancylancy.flyergame.items.Button;
import com.fancylancy.flyergame.items.HeaderImage;
import com.fancylancy.flyergame.items.LargeTextImage;
import com.fancylancy.flyergame.items.SmallTextImage;

/**
 * Created by SuckIt on 6/21/15.
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
    }

    @Override
    public void render(float delta) {
        super.render(delta);
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
