package JDBCAndHibernate.entities.concretes;

import JDBCAndHibernate.entities.abstracts.Entity;

public class Category implements Entity{
	
	private String categoryName;
	

	public Category() {}

	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	

}
