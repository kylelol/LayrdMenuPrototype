package com.cop4331.prototype.menutest1;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
	
	public static Texture menuItems;
	public static TextureRegion mainMenu;
	
	public static Texture loadTexture (String file)
	{
		return new Texture(Gdx.files.internal(file));
	}
	
	public static void load()
	{
		menuItems = loadTexture("items.png");
		mainMenu = new TextureRegion(menuItems, 0, 224, 300, 110);
		
	}

}
