package com.connordoman.events;

import com.connordoman.main.Game;

public class InputEvent extends Event {
	
	public void checkRequirementForInput() {
		if (Game.inputField.getText().equals(getRequirement())) {
			complete();
		} else if (Game.inputField.getText().length() > getRequirement().length()) {
			System.out.println("Input is too long. Max length: " + getRequirement().length());
		} else {
			return;
		}
	}
}
