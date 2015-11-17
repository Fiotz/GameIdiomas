package br.edu.ufabc.iniciacaocientifica.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import br.edu.ufabc.iniciacaocientifica.JogoDosIdiomas;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new JogoDosIdiomas(), config);
	}
}
