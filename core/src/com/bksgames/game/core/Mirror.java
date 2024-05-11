package com.bksgames.game.core;

import com.bksgames.game.enums.Direction;
import com.bksgames.game.enums.PlayerColor;

public class Mirror{
	PlayerColor color;
	Orientation orientation;

	enum Orientation {
		SLASH, BACKSLASH;
	}

	Direction deflect(Direction direction){
		Direction afterDirection = direction;

		if(orientation==Orientation.SLASH) {
			return Direction.values()[(direction.ordinal()-1)%4];
		}
		else{
			return Direction.values()[(direction.ordinal()+1)%4];
		}
	}
}
