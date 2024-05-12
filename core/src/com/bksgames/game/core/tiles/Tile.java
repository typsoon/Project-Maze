package com.bksgames.game.core.tiles;

import com.bksgames.game.enums.Displayable;

public interface Tile {
    // RETURNS TUNNEL IF TILE IS TUNNEL OTHERWISE NULL
    Displayable getDisplayable();
    Tunnel getTunnel();
	default boolean isHollow() {
		return getTunnel()!=null;
	}
}