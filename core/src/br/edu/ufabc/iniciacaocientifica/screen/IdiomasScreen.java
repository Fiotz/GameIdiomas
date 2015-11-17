package br.edu.ufabc.iniciacaocientifica.screen;

import com.badlogic.gdx.Screen;
import br.edu.ufabc.iniciacaocientifica.JogoDosIdiomas;

public abstract class IdiomasScreen implements Screen{
	
	protected JogoDosIdiomas Idiomas;
	
	public IdiomasScreen(JogoDosIdiomas Idiomas){
		this.Idiomas = Idiomas;
	}
	
	public abstract void update (float delta);
	
	public abstract void draw (float delta);
	
	public abstract boolean isDone ();
	
	@Override
	public void show() {
	}

	@Override
	public void render(float delta) {
		update(delta);
		draw(delta);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void dispose() {
	}
	
	

}
