package com.marzeta.storyteller.stories;

import com.marzeta.storyteller.elements.Person;
import com.marzeta.storyteller.elements.Place;
import com.marzeta.storyteller.elements.Time;
import com.marzeta.storyteller.elements.Verb;

public class WarEnds extends Story {
	public WarEnds() {
	}

	public static void main(String[] args) {
		WarEnds w = new WarEnds();
		Sentence s = new Sentence();
		s.setTime(new Time("Once upon a time"));
		s.setSubject(new Person("a soldier"));
		s.setVerb(new Verb("appears"));
		s.setObject(new Place("on the road from distant lands"));
		
		w.statements.add(s);
		
		w.run();
	}
}
