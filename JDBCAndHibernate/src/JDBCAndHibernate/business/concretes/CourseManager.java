package JDBCAndHibernate.business.concretes;


import JDBCAndHibernate.business.abstracts.CourseService;
import JDBCAndHibernate.entities.concretes.Course;

public class CourseManager implements CourseService{
	
	public void add(Course course) {
		if (course.getCourseName()=="Web Programing") {
			System.out.println("Bu ders eklenemez çünkü zaten var!");
		}else {
			if(course.getCoursePrice()<=0) {
				System.out.println("Bu ders eklenemez çünkü fiyat 0'dan büyük olmalı!");
			}else {
				System.out.println("Başarıyla eklendi");
			}
		}
		
		
	}

	
	
	
}
