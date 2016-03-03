package com.marzeta.storyteller.stories;

import com.marzeta.storyteller.elements.Noun;
import com.marzeta.storyteller.elements.Time;
import com.marzeta.storyteller.elements.Verb;

public class Sentence {
	private Noun subject;
	private Verb verb;
	private Noun object;
	private Time time;

	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if (time != null) {
			sb.append(time);
		}
		if (subject != null) {
			sb.append(" ");
			sb.append(subject);
		}
		if (verb != null) {
			sb.append(" ");
			sb.append(verb);
		}
		if (object != null) {
			sb.append(" ");
			sb.append(object);
		}
		return sb.toString();
	}
	
	public Noun getSubject() {
		return subject;
	}

	public void setSubject(Noun subject) {
		this.subject = subject;
	}

	public Verb getVerb() {
		return verb;
	}

	public void setVerb(Verb verb) {
		this.verb = verb;
	}

	public Noun getObject() {
		return object;
	}

	public void setObject(Noun object) {
		this.object = object;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
