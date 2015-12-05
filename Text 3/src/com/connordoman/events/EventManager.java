package com.connordoman.events;

public class EventManager implements Runnable {

	@Override
	public void run() {
		SetNameTestEvent nameEvent = new SetNameTestEvent();
		while (!nameEvent.getCompleted()) {
			continue;
		}
	}

}
