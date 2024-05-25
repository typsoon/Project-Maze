package com.bksgames.game.core.updates;

import com.bksgames.game.common.Displayable;
import com.bksgames.game.common.MinionEvent;
import com.bksgames.game.common.moves.ActionToken;
import com.bksgames.game.common.updates.UpdateIDs;
import com.bksgames.game.core.utils.Point;
import com.bksgames.game.common.updates.MinionUpdate;
import com.bksgames.game.common.utils.*;

/**
 * Simple implementation of {@code MinionUpdate}
 *
 * @author riper
 */
public class SimpleMinionUpdate implements MinionUpdate {
    private final Direction direction;
    private final Displayable displayable;
    private final MinionEvent event;
    private final ActionToken move;
    private final Point relativePosition;

    //MinionUpdate
    @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public Displayable getDisplayable() {
        return displayable;
    }

    @Override
    public ActionToken getMoveType() {
        return move;
    }

    @Override
    public MinionEvent getEvent() {
        return event;
    }

    @Override
    public UpdateIDs getID() {
        return UpdateIDs.MINION_UPDATE;
    }

    @Override
    public int getRelativeX() {
        return relativePosition.x;
    }

    @Override
    public int getRelativeY() {
        return relativePosition.y;
    }

    /**
     * Constructs simple {@code MinionUpdate}
     */
    public SimpleMinionUpdate(Direction direction, Displayable displayable, MinionEvent event, ActionToken move, Point relativePosition) {
        this.direction = direction;
        this.displayable = displayable;
        this.event = event;
        this.move = move;
        this.relativePosition = relativePosition.getPosition();
    }
}
