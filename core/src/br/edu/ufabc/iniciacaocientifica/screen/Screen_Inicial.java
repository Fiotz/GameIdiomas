package br.edu.ufabc.iniciacaocientifica.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Matrix4;

import br.edu.ufabc.iniciacaocientifica.JogoDosIdiomas;

public class Screen_Inicial extends IdiomasScreen{
	
	private boolean isDone = false;
	
	private final SpriteBatch spriteBatch;
	
	private final Texture background;
	private final Texture botao;
	

	private final Matrix4 viewMatrix = new Matrix4();
	private final Matrix4 transformMatrix = new Matrix4();



	public Screen_Inicial(JogoDosIdiomas Idiomas) {
		super(Idiomas);
		spriteBatch = new SpriteBatch();
		
		background = new Texture(Gdx.files.internal("background.png"));
		background.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		botao = new Texture(Gdx.files.internal("botao.png"));
		botao.setFilter(TextureFilter.Linear, TextureFilter.Linear);

		
	}

	@Override
	public void update(float delta) {
		if(Gdx.input.justTouched())
		{
			System.out.println("Foi");
			isDone = true;
			
		}
	}

	@Override
	public void draw(float delta) {
		viewMatrix.setToOrtho2D(0, 0, 480, 320);
		spriteBatch.setProjectionMatrix(viewMatrix);
		spriteBatch.setTransformMatrix(transformMatrix);
		spriteBatch.begin();
		spriteBatch.disableBlending();
		spriteBatch.setColor(Color.WHITE);
		spriteBatch.draw(background, 0, 0, 480, 320, 0, 0, 512, 512, false, false);
		spriteBatch.enableBlending();
		spriteBatch.draw(botao, 100, 320 - 128, 100, 75, 0, 0, 512, 512, false, false);
		spriteBatch.end();

	}

	@Override
	public boolean isDone() {
		return isDone;
	}
	
	@Override
	public void dispose(){
		spriteBatch.dispose();
		background.dispose();
		botao.dispose();
	}

}
