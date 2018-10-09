package com.mygdx.game.desktop;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.FarmGames;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Test";
		config.useGL30 = false;
		config.width = 1240;
		config.height = 800;
		config.resizable = false;
		config.vSyncEnabled = true;
		new LwjglApplication(new FarmGames(), config);
	}
}
