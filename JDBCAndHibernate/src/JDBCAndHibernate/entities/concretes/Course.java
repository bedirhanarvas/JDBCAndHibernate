package JDBCAndHibernate.entities.concretes;

import JDBCAndHibernate.entities.abstracts.Entity;

public class Course implements Entity{
	
	private String courseName;
	private int coursePrice;
	
	
	public Course () {}


	public Course(String courseName, int coursePrice) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getCoursePrice() {
		return coursePrice;
	}


	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	

}
