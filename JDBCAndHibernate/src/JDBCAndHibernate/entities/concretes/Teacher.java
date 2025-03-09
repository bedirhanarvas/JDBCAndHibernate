package JDBCAndHibernate.entities.concretes;

import JDBCAndHibernate.entities.abstracts.Entity;

public class Teacher implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private String whichCourseTeacher;
	
	public Teacher() {}
	
	public Teacher(int id, String firstName, String lastName, String whichCourseTeacher) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.whichCourseTeacher = whichCourseTeacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getWhichCourseTeacher() {
		return whichCourseTeacher;
	}

	public void setWhichCourseTeacher(String whichCourseTeacher) {
		this.whichCourseTeacher = whichCourseTeacher;
	}


	
	
	
}
