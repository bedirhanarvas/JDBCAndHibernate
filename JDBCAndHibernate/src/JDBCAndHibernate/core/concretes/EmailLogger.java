package JDBCAndHibernate.core.concretes;

import JDBCAndHibernate.core.abstracts.BaseLogger;

public class EmailLogger implements BaseLogger{

	@Override
	public void log() {
		System.out.println("Email ile loglandı.");
	}

}
