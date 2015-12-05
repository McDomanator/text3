package com.connordoman.main;

import java.awt.BorderLayout;
import java.io.PrintStream;

import javax.swing.JFrame;

public class Window extends JFrame {
	private static final long serialVersionUID = 8719386375669845503L;

	private ConsolePanel consolePanel;

	public Window() {
		setTitle(Game.WINDOW_TITLE);
		setSize(600, 400);

		init();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void init() {
		// add console panel
		consolePanel = new ConsolePanel();
		add(consolePanel, BorderLayout.CENTER);

		// system.out stuff
		PrintStream os = new PrintStream(new ConsoleOutputStream(Game.console));
		System.setOut(os);

	}
}
