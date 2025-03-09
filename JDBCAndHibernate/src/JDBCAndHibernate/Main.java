package JDBCAndHibernate;

import JDBCAndHibernate.business.abstracts.CourseService;
import JDBCAndHibernate.entities.concretes.Course;

public class Main {

	public static void main(String[] args) {
		
		Course course = new Course();
		
		course.setCourseName("Web Programing");
		course.setCoursePrice(0);
		
		
		
	}

}
