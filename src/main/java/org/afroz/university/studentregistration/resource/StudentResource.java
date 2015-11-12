package org.afroz.university.studentregistration.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.afroz.university.studentregistration.model.Student;
import org.afroz.university.studentregistration.service.StudentService;

@Path("students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {

	private StudentService studentService = new StudentService();

	@GET
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@GET
	@Path("/{studentId}")
	public Student getStudent(@PathParam("studentId") Long id) {
		return studentService.getStudent(id);
	}

	@POST
	public Student addStudent(Student student) {
		return studentService.addStudent(student);
	}

	@PUT
	public Student updateStudent(Student student) {
		return studentService.updateStudent(student);
	}

	@DELETE
	@Path("/{studentId}")
	public void deleteStudent(@PathParam("studentId") Long id) {
		studentService.deleteStudent(id);
	}
}
