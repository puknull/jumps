package com.jumpcoin.winner.framework.impl;

import com.jumpcoin.winner.framework.Game;
import com.jumpcoin.winner.framework.Screen;

public abstract class GLScreen extends Screen {
	protected final GLGraphics glGraphics;
	protected final GLGame glGame;

	public GLScreen(Game game) {
		super(game);
		glGame = (GLGame)game;
		glGraphics = ((GLGame)game).getGLGraphics();
	}
}
