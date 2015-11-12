package org.afroz.university.studentregistration.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String name;
	private long id;
	private Date created;
	
	public Student(){
	}
	
	public Student(String name, long id, Date created) {
		super();
		this.name = name;
		this.id = id;
		this.created = created;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
}