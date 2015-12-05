package com.connordoman.main;

import java.awt.BorderLayout;
import java.io.PrintStream;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Window extends JFrame {
	private static final long serialVersionUID = 8719386375669845503L;

	private Console console;
	private InputField inputField;

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
		
		// console stuff
		console = new Console();
		JScrollPane scroller = new JScrollPane();
		scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		console.add(scroller);

		// system.in stuff
		inputField = new InputField();

		// system.out stuff
		PrintStream os = new PrintStream(new ConsoleOutputStream(console));
		System.setOut(os);
		System.setErr(os);

		// add stuff
		add(console, BorderLayout.CENTER);
		add(inputField, BorderLayout.SOUTH);
	}
}
