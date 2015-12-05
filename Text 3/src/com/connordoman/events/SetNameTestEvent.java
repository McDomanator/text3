package com.connordoman.events;

import com.connordoman.main.Game;

public class SetNameTestEvent extends InputEvent {
	
	public SetNameTestEvent() {
		setRequirement("........");
		setDescription("Please enter your name");
		System.out.println(getDescription());
	}
	
	public void onCompletion() {
		Game.playerName = Game.inputField.getText();
	}
}
