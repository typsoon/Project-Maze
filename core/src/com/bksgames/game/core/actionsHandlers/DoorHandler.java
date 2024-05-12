package com.bksgames.game.core.actionsHandlers;

import com.bksgames.game.core.main.GameManager;
import com.bksgames.game.core.utils.Move;
import com.bksgames.game.enums.MoveTypes;

public class DoorHandler extends ActionHandler {
    @Override
    public void handle(Move action) {
        if(action.type() != MoveTypes.MOVE)
            throw new IllegalStateException("Wrong move type!");
    }
    DoorHandler(GameManager manager) {
        super(manager);
    }
}