package com.bksgames.game.views.gameScreen.legalMovesHandling.actionButtons;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.bksgames.game.common.enums.ActionToken;
import com.bksgames.game.viewmodels.moves.IncompleteMove;

import java.util.HashMap;
import java.util.Map;

public class ActionButtonFactory {
    private final Map<ActionToken, ActionButtonGetter> mapping = new HashMap<>();
    private final Map<IncompleteMove, Actor> moveToActorMap;

    public Actor getButton(IncompleteMove incompleteMove) {
        Actor actor = mapping.get(incompleteMove.type()).get(incompleteMove);
        moveToActorMap.put(incompleteMove, actor);
        return actor;
    }

    public ActionButtonFactory(TextureAtlas atlas, Map<IncompleteMove, Actor> incompleteMoveActorMap) {
        this.moveToActorMap = incompleteMoveActorMap;

        mapping.put(ActionToken.MOVE, new ArrowGetter(atlas));
        mapping.put(ActionToken.MIRROR, new MirrorButtonGetter(atlas));
    }
}
