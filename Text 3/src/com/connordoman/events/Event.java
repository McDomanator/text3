package com.connordoman.events;

public abstract class Event {
	
	private boolean completed;
	private String requirement;
	private String description;
	
	public Event() {
		completed = false;
		System.out.println(description);
	}
	
	public void onCompletion() {
		System.out.println("Congratulations");
	}
	
	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getCompleted() {
		return completed;
	}
	
	public void complete() {
		completed = true;
	}
}
