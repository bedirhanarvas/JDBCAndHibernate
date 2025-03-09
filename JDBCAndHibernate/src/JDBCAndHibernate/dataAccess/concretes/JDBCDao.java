package JDBCAndHibernate.dataAccess.concretes;

import JDBCAndHibernate.dataAccess.abstracts.BaseDao;

public class JDBCDao implements BaseDao{

	@Override
	public void add() {
		System.out.println("JDBC ile loglandı");
	}

}
