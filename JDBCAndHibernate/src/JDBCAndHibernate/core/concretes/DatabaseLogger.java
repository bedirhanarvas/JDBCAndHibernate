package JDBCAndHibernate.core.concretes;

import JDBCAndHibernate.core.abstracts.BaseLogger;

public class DatabaseLogger implements BaseLogger{

	@Override
	public void log() {
		System.out.println("Database ile loglandı.");
	}

}
