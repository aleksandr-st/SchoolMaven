package local.Web.SchoolMaven.model;

import java.util.HashSet;
import java.util.Set;

public class SchoolClass {
	static Integer MAX_NUMBER_OF_STUDENTS = 10;
	
	private String name;
	
	private Set<Student> students = new HashSet<Student>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public SchoolClass (String name){
		this.name = name;
	}
	
	public String toString(){
		return "Class name: " + name + ", number of students: " + students.size();
	}
}
