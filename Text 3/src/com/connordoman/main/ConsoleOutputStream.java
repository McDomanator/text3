package com.connordoman.main;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputStream extends OutputStream {
	
	private Console console;
	
	public ConsoleOutputStream(Console console) {
		this.console = console;
	}
	
	public void write(int arg0) throws IOException {
		console.append(String.valueOf((char)arg0));
		console.setCaretPosition(console.getDocument().getLength());
	}
	
}
