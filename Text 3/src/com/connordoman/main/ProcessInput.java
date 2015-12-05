package com.connordoman.main;

public class ProcessInput {

	private InputField field;

	public ProcessInput(InputField field) {
		this.field = field;
	}

	public void process() {
		String fieldText = field.getText();

		if (fieldText.trim().startsWith("say")) {
			String regex = "say";
			String message = fieldText.substring(fieldText.indexOf(regex) + regex.length());
			message = message.trim();
			System.out.println(message);
			return;
		} else if (fieldText.trim().startsWith("get-name")) {
			System.out.println(Game.playerName);
			return;
		} else if (fieldText.trim().startsWith("exit")) {
			System.out.println("Thanks for playing!");
			System.exit(0);
		} else {
			System.out.println("Invalid command: " + fieldText);
			return;
		}
	}

}
