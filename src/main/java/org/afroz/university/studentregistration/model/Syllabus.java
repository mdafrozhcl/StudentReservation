package org.afroz.university.studentregistration.model;

import java.util.HashMap;
import java.util.Map;

public class Syllabus {

	private Map<Long, String> outline = new HashMap<Long, String>();
	
	public Syllabus() {
	}

	public Syllabus(Map<Long, String> outline) {
		super();
		this.outline = outline;
	}

	public Map<Long, String> getOutline() {
		return outline;
	}

	public void setOutline(Map<Long, String> outline) {
		this.outline = outline;
	}
}
