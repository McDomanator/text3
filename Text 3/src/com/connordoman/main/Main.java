package com.connordoman.main;

public class Main {
	
	private Window window;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}
	
	private void init() {
		window = new Window();
		System.out.println("Title: " + Game.TITLE);
		System.out.println("Release: " + Game.RELEASE_TYPE);
		System.out.println("Version: " + Game.VERSION);
		System.out.println("Size: (" + window.getWidth() + "," + window.getHeight() + ")");
	}
}
