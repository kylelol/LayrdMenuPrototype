package com.cop4331.prototype.menutest1;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainMenuScreen implements Screen {

	MyGdxGame game;
	
	SpriteBatch batch;
	Texture img;
	OrthographicCamera guiCam;
	
	public MainMenuScreen(MyGdxGame aGame)
	{
		game = aGame;
		guiCam = new OrthographicCamera(480,320);
		//guiCam.setToOrtho(true);
		guiCam.position.set(480/2,320/2,0);
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		
	}
	
	public void handleInput()
	{
		System.out.println(Gdx.input.getX() + "----" + Gdx.input.getY());
	}
	
	@Override
	public void render(float delta) {
		
		handleInput();
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		guiCam.update();
		batch.setProjectionMatrix(guiCam.combined);
		

		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(Assets.mainMenu, 0, 0);
		batch.end();
		
	
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
