package com.connordoman.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomInputStream extends InputStream {
	
	private LinkedBlockingQueue<Character> sb;
	
	public CustomInputStream(LinkedBlockingQueue<Character> sb) {
		this.sb = sb;
	}
	
	@Override
	public int read() throws IOException {
		int c = -1;
		try {
			c = sb.take();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		return c;
	}

}
