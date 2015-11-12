package org.afroz.university.studentregistration.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.afroz.university.studentregistration.database.Database;
import org.afroz.university.studentregistration.model.Student;

public class StudentService {

	public Map<Long, Student> students = Database.getStudents();
	
	public StudentService() {
		students.put(1L, new Student("Afroz", 103240, new Date()));
		students.put(2L, new Student("Ravi", 103241, new Date()));
	}

	public List<Student> getStudents(){
		return new ArrayList<Student>(students.values());
	}
	
	public Student getStudent(Long id){
		return students.get(id);
	}
	
	public Student addStudent(Student student){
		students.put((long) students.size()+1, student);
		return student;
	}
	
	public Student updateStudent(Student student){
		if(student.getId() ==0)
			return null;
		students.put(student.getId(), student);
		return student;
	}
	
	public void deleteStudent(Long id){
		students.remove(id);
	}
}
