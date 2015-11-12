package org.afroz.university.studentregistration.database;

import java.util.HashMap;
import java.util.Map;

import org.afroz.university.studentregistration.model.Course;
import org.afroz.university.studentregistration.model.Student;

public class Database {
	public static final Map<Long, Student> students = new HashMap<>();
	public static final Map<Long, Course> course = new HashMap<>();

	public static Map<Long, Course> getCourse() {
		return course;
	}

	public static Map<Long, Student> getStudents() {
		return students;
	}
}
