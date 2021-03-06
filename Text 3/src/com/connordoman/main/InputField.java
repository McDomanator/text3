package com.connordoman.main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class InputField extends JTextField {
	private static final long serialVersionUID = 5490830098904433039L;

	private ProcessInput processor;

	public InputField() {
		processor = new ProcessInput(this);
		addActionListener(new InputFieldListener());
		setBorder(BorderFactory.createCompoundBorder(getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		Font fieldFont = new Font("Consolas", Font.PLAIN, getFont().getSize());
		setFont(fieldFont);
		requestFocusInWindow();
	}

	class InputFieldListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Game.inputLog.add(getText());
			processor.process();
			setText("");
		}

	}
}
