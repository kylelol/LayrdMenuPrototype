package com.cop4331.prototype.menutest1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public class MyGdxGame extends Game {
	
	GoogleGameInterface gameInterface;

	public MyGdxGame(GoogleGameInterface aInterface)
	{
		gameInterface = aInterface;
	}
	
	@Override
	public void create () {
		Assets.load();
		setScreen(new MainMenuScreen(this));

	}

	/*@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
		
		if (Gdx.input.isTouched())
		{
			//this.gameInterface.logOutGPGS();
			System.out.println(Gdx.input.getX() + "--------" + Gdx.input.getY());
			//this.gameInterface.getAchievementsGPGS();
			//this.gameInterface.getLeaderboardGPGS();
		}
	}*/
}
