package local.Web.SchoolMaven.model;

import java.util.Date;

public class Student {
	private String firstName;
	
	private String secondName;
	
	private Date birthDay;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public Student(String firstName, String secondName, Date birthDay){
		this.firstName = firstName;
		this.secondName = secondName;
		this.birthDay = birthDay;
	}
	
	public String toString(){
        return "Student [name=" + firstName + ", surname=" + secondName + ", birthday=" + 
        		birthDay + "]";
	}

}
