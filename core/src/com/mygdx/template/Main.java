package com.mygdx.template;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.template.managers.MyAssetManager;
import com.mygdx.template.screens.GameScreen;
import com.mygdx.template.screens.MenuScreen;
import com.mygdx.template.screens.SettingsScreen;

public class Main extends Game {

	private SpriteBatch batch;
	public Viewport screenPort;
	public MyAssetManager myAssetManager = new MyAssetManager();

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		OrthographicCamera camera = new OrthographicCamera();
		camera.setToOrtho(false);
		screenPort = new ScreenViewport();
		this.setScreen(new MenuScreen(this));
	}

	public void gotoMenuScreen(){
		MenuScreen menuScreen = new MenuScreen(this);
		setScreen(menuScreen);
	}

	public void gotoSettingsScreen(){
		SettingsScreen settingsScreen = new SettingsScreen(this);
		setScreen(settingsScreen);
	}

	public void gotoGameScreen(){
		GameScreen gameScreen = new GameScreen(this);
		setScreen(gameScreen);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
}
