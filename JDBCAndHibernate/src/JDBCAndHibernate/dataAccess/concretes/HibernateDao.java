package JDBCAndHibernate.dataAccess.concretes;

import JDBCAndHibernate.dataAccess.abstracts.BaseDao;


public class HibernateDao implements BaseDao{

	@Override
	public void add() {

		System.out.println("Hibernate ile Loglandı");
	}

}
