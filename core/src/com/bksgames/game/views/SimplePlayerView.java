package com.bksgames.game.views;

import com.bksgames.game.core.Player;

import java.util.Queue;

public class SimplePlayerView implements PlayerView {
    final Player.PlayerColor watched;

    int maxX, minX, maxY, minY;

    Queue<Update> updates;

    @Override
    public Player.PlayerColor getWatched() {return watched;}

    @Override
    public int getMaxX() {return maxX;}

    @Override
    public int getMaxY() {return maxY;}

    @Override
    public int getMinX() {return minX;}

    @Override
    public int getMinY() {return minY;}

    @Override
    public void PushUpdate(Update update) {
        updates.add(update);
    }

    public Update getUpdate() {
        return updates.poll();
    }

    SimplePlayerView(Player.PlayerColor watched) {this.watched = watched;}
}
