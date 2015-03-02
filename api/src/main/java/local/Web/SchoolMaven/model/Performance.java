package local.Web.SchoolMaven.model;

import java.util.Date;

public class Performance {
	
	private String name;
	
	private Date executionDay;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getExecutionDay() {
		return executionDay;
	}

	public void setExecutionDay(Date executionDay) {
		this.executionDay = executionDay;
	}
	
	public String toString(){
		return " Performance name: " + name + ", assigned to date: " + executionDay;
	}

}
