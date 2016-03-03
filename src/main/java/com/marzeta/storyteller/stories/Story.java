package com.marzeta.storyteller.stories;

import java.util.ArrayList;
import java.util.List;

public abstract class Story {
	List<Sentence> statements = new ArrayList<>();
	
	public void run() {
		for (Sentence statement : statements) {
			System.out.println(statement + ".");
		}
	}
}
