package com.jumpcoin.winner.framework;

import com.jumpcoin.winner.framework.math.Rectangle;
import com.jumpcoin.winner.framework.math.Vector2;

public class GameObject {
	public final Vector2 position;
	public final Rectangle bounds;

	public GameObject(float x, float y, float width, float height) {
		this.position = new Vector2(x,y);
		this.bounds = new Rectangle(x-width/2, y-height/2, width, height);
	}
}
