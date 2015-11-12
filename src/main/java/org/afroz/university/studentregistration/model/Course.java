package org.afroz.university.studentregistration.model;

import java.util.Date;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course {

	private String name;
	private int id;
	private Syllabus syllabus;
	private Date created;
	private Map<Long, Tutor> tutors;
	
	public Map<Long, Tutor> getTutors() {
		return tutors;
	}

	public void setTutors(Map<Long, Tutor> tutors) {
		this.tutors = tutors;
	}

	public Course() {

	}

	public Course(String name, int id, Syllabus syllabus, Date created) {
		super();
		this.name = name;
		this.id = id;
		this.syllabus = syllabus;
		this.created = created;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Syllabus getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(Syllabus syllabus) {
		this.syllabus = syllabus;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	

}
