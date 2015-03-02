package local.Web.SchoolMaven.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import local.Web.SchoolMaven.model.Performance;
import local.Web.SchoolMaven.model.SchoolClass;
import local.Web.SchoolMaven.model.Student;

public class MusicSchoolOrganizerImpl implements MusicSchoolOrganizer {
	private Set<SchoolClass> schoolClasses = new HashSet<SchoolClass>();
	
	private Set<Student> students = new HashSet<Student>();

	public void addNewStudent(Student student, SchoolClass schoolClass) {
		// TODO Auto-generated method stub
		if (schoolClass != null){
			schoolClass.getStudents().add(student);
			students.add(student);
		}
	}

	public void deleteStudentFromClass(Student student, SchoolClass schoolClass) {
		// TODO Auto-generated method stub
		if (schoolClass != null){
			schoolClass.getStudents().remove(student);
		}
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.addAll(students);
		return listOfStudents;
	}

	public List<Student> getStudentsFromClass(SchoolClass schoolClass) {
		// TODO Auto-generated method stub
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.addAll(schoolClass.getStudents());
		return listOfStudents;
	}

	public void schedulePerformance(Performance performance) {
		// TODO Auto-generated method stub

	}

	public Set<SchoolClass> getSchoolClasses() {
		return schoolClasses;
	}

	public void setSchoolClasses(Set<SchoolClass> schoolClasses) {
		this.schoolClasses = schoolClasses;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
