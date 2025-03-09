package JDBCAndHibernate.core.concretes;

import JDBCAndHibernate.core.abstracts.BaseLogger;

public class SmsLogger implements BaseLogger{

	@Override
	public void log() {
		System.out.println("SMS ile loglandı.");
	}

}
