package com.connordoman.main;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.connordoman.main.Console;
import com.connordoman.main.InputField;

public class ConsolePanel extends JPanel {
	private static final long serialVersionUID = 4882171775979980863L;

	private Console console;
	private InputField inputField;

	public ConsolePanel() {
		setBorder(BorderFactory.createTitledBorder(getBorder(), "shit balls"));
		
		// console stuff
		console = Game.console;
		JScrollPane scroller = new JScrollPane();
		scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		console.add(scroller);

		// inputfield stuff
		inputField = Game.inputField;

		// add stuff
		add(console, BorderLayout.CENTER);
		add(inputField, BorderLayout.SOUTH);
	}
}
