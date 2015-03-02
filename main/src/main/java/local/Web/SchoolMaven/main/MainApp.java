package local.Web.SchoolMaven.main;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import local.Web.SchoolMaven.api.MusicSchoolOrganizerImpl;
import local.Web.SchoolMaven.model.SchoolClass;
import local.Web.SchoolMaven.model.Student;

/**
 * Hello world!
 *
 */
public class MainApp {
	
	private MusicSchoolOrganizerImpl apiClass = new MusicSchoolOrganizerImpl(); 
	
    public static void main( String[] args )
    {
    	MainApp ma = new MainApp();
    	
    	SchoolClass sc = new SchoolClass("piano");
    	Calendar birthDay = new GregorianCalendar();
    	birthDay.set(1990, 10, 2);
    	ma.addStudent("John", "Smith", birthDay.getTime(), sc);
    	birthDay.set(1980, 05, 5);
    	ma.addStudent("Eva", "Smith", birthDay.getTime(), sc);
    	
    	SchoolClass sc2 = new SchoolClass("guitar");
    	birthDay.set(1985, 4, 22);
    	ma.addStudent("Mila", "Kunis", birthDay.getTime(), sc2);
    	birthDay.set(1976, 3, 18);
    	ma.addStudent("Mark", "Johnson", birthDay.getTime(), sc2);
    	
    	System.out.println("All student list contains:\n");
    	ma.printList(ma.apiClass.getAllStudents());
    	
    	System.out.println("Student list for class \"" + sc.getName() + "\" contains:\n");
    	ma.printList(ma.apiClass.getStudentsFromClass(sc));

    	System.out.println("Student list for class \"" + sc2.getName() + "\" contains:\n");
    	ma.printList(ma.apiClass.getStudentsFromClass(sc2));

    }
    
    private void addStudent(String firstName, String secondName, Date birthDay, SchoolClass schoolClass){
    	Student stud = new Student(firstName,secondName,birthDay);
    	apiClass.addNewStudent(stud, schoolClass);
    	
    }
    
    private void printList (List listForPrint){
    	for (Object obj: listForPrint){
    		System.out.println(obj);
    	}
		System.out.println();
    }

	public MusicSchoolOrganizerImpl getApiClass() {
		return apiClass;
	}

	public void setApiClass(MusicSchoolOrganizerImpl apiClass) {
		this.apiClass = apiClass;
	}
}
