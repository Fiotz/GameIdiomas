package br.edu.ufabc.iniciacaocientifica.screen;

import com.badlogic.gdx.Gdx;

import br.edu.ufabc.iniciacaocientifica.JogoDosIdiomas;

public class Screen_Inicial extends IdiomasScreen{
	
	private boolean isDone = false;

	public Screen_Inicial(JogoDosIdiomas Idiomas) {
		super(Idiomas);
		
		
	}

	@Override
	public void update(float delta) {
		
	}

	@Override
	public void draw(float delta) {
		
	}

	@Override
	public boolean isDone() {
		if(Gdx.input.isTouched(0)){
			
		}
		return isDone;
	}

}
