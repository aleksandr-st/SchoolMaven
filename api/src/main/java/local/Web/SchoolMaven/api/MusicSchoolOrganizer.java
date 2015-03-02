package local.Web.SchoolMaven.api;

import java.util.List;

import local.Web.SchoolMaven.model.Performance;
import local.Web.SchoolMaven.model.SchoolClass;
import local.Web.SchoolMaven.model.Student;

public interface MusicSchoolOrganizer {
	void addNewStudent(Student student, SchoolClass schoolClass);
	
	void deleteStudentFromClass(Student student, SchoolClass schoolClass);
	
	List<Student> getAllStudents();
	
	List<Student> getStudentsFromClass(SchoolClass schoolClass);
	
	void schedulePerformance(Performance performance);

}
