package com.jumpcoin.winner.jumper;

import com.jumpcoin.winner.framework.GameObject;

public class Castle extends GameObject {
	public static float CASTLE_WIDTH = 1.7f;
	public static float CASTLE_HEIGHT = 1.7f;

	public Castle(float x, float y) {
		super(x, y, CASTLE_WIDTH, CASTLE_HEIGHT);
	}
}
