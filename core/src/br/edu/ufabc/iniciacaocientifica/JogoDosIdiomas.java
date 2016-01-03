package br.edu.ufabc.iniciacaocientifica;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import br.edu.ufabc.iniciacaocientifica.screen.IdiomasScreen;
import br.edu.ufabc.iniciacaocientifica.screen.Screen_Inicial;

public class JogoDosIdiomas extends Game {
	SpriteBatch batch;
	Texture img;
	Music music;
	
	@Override
	public void create () {
		setScreen(new Screen_Inicial(this));
		
		Gdx.input.setInputProcessor(new InputAdapter() {
			@Override
			public boolean keyUp (int keycode) {
				if (keycode == Keys.ENTER && Gdx.app.getType() == ApplicationType.WebGL) {
					if (!Gdx.graphics.isFullscreen()) Gdx.graphics.setDisplayMode(Gdx.graphics.getDisplayModes()[0]);
				}
				return true;
			}
		});
	}

	@Override
	public void render () {
		IdiomasScreen currentScreen = getScreen();
		
		currentScreen.render(Gdx.graphics.getDeltaTime());
		
		if (currentScreen.isDone()) {
			// dispose the resources of the current screen
			currentScreen.dispose();

			// if the current screen is a main menu screen we switch to
			// the game loop
			if (currentScreen instanceof Screen_Inicial) {
				setScreen(new Screen_Inicial(this));
			}else{
				//setScreen(new Screen_Inicial(this));
			}
		}

		
	}
	
	@Override
	public IdiomasScreen getScreen () {
		return (IdiomasScreen)super.getScreen();
	}
	
}
