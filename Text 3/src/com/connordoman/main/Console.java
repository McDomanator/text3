package com.connordoman.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class Console extends JTextArea {
	private static final long serialVersionUID = 8683321798690845257L;
	
	public Console() {
		Font font = new Font("Consolas", Font.PLAIN, 12);
		setFont(font);
		
		setForeground(Color.GRAY);
		setBackground(Color.BLACK);
		
		setEditable(false);
	}
}
