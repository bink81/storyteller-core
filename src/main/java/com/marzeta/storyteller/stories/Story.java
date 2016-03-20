package com.marzeta.storyteller.stories;

import java.util.ArrayList;
import java.util.List;

public abstract class Story {
	private final List<Sentence> sentences = new ArrayList<>();
	private boolean finished = false;

	void addSentence(Sentence sentence) {
		sentences.add(sentence);
	}

	public void run() {
		for (Sentence sentence : sentences) {
			System.out.println(sentence + ".");
		}
		setFinished(true);
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}
