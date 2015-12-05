package com.connordoman.main;

import com.connordoman.events.Event;

public class Game {

	public static final String VERSION = "0.5";
	public static final String RELEASE_TYPE = "Alpha";
	public static final String TITLE = "GAME OF THE YEAR";
	public static final String WINDOW_TITLE = TITLE + " [" + RELEASE_TYPE + " " + VERSION + "]";
	
	public static Console console = new Console();
	public static InputField inputField = new InputField();
	
	public static Event currentEvent;
	public static String playerName;
}
