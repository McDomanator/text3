package com.connordoman.main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

import com.connordoman.events.InputEvent;

public class InputField extends JTextField {
	private static final long serialVersionUID = 5490830098904433039L;
	
	private ProcessInput processor;
	
	public InputField() {
		processor = new ProcessInput(this);
		addActionListener(new InputFieldListener());
		setBorder(BorderFactory.createCompoundBorder(getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		Font fieldFont = new Font("Consolas", Font.PLAIN, getFont().getSize());
		setFont(fieldFont);
	}
	
	class InputFieldListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			processor.process();
			if (Game.currentEvent.getClass() == InputEvent.class) {
				((InputEvent) Game.currentEvent).checkRequirementForInput();
				if (Game.currentEvent.getCompleted()) {
					Game.currentEvent.onCompletion();
				}
			}
			setText("");
		}

	}
}
