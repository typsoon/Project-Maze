package com.bksgames.game.viewmodels;

import com.bksgames.game.core.utils.Point;
import com.bksgames.game.common.utils.Direction;

import java.util.List;


public interface PlayerViewModel {
    void laserFired(Point position);
    void swordSwung(Point position);
    int getMostDistant(Direction direction);

    void tileRevealed(Point position);
    void minionMoved(Point start, Direction direction);
    List<Point> getMinionsPositions();
    void minionKilled(Point position);
    void minionSpawned(Point position);

    Point getMinionPos(int id);
    int getMinionId(Point position);

    boolean hasPlayableMinion(Point position);
}
