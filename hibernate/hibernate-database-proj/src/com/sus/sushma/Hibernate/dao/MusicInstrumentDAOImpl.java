package com.sus.sushma.Hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sus.sushma.Hibernate.dto.MusicInstrumentDTO;

public class MusicInstrumentDAOImpl implements MusicInstrumentDAO {

	public void saveMusicInstrument(MusicInstrumentDTO instrumentDTO) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(instrumentDTO.getClass());
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(instrumentDTO);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
