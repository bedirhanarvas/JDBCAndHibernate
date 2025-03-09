package JDBCAndHibernate.business.concretes;

import JDBCAndHibernate.business.abstracts.CategoryService;
import JDBCAndHibernate.entities.concretes.Category;

public class CategoryManager implements CategoryService{
	
	public void add(Category category) {
		if(category.getCategoryName()=="java") {
			System.out.println("Bu category eklenemez!");
		}else {
			System.out.println("Category eklendi!");
		}
	}

}
