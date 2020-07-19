package com.sus.sushma.Hibernate.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sus.sushma.Hibernate.dto.AgriDTO;

public class AgriDAOImpl implements AgriDAO{
	public void saveAgri(AgriDTO dto) {
	 Configuration configuration=new Configuration();
	 configuration.configure();
	 configuration.addAnnotatedClass(dto.getClass());
	 SessionFactory sessionFactory=configuration.buildSessionFactory();
	 Session session=sessionFactory.openSession();
	 Transaction transaction=session.beginTransaction();
	 session.save(dto);
	 transaction.commit();
	 session.close();
	 sessionFactory.close();
	}

	@Override
	public void getAgri(int id) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		 configuration.configure();
		 configuration.addAnnotatedClass(AgriDTO.class);
		 SessionFactory sessionFactory=configuration.buildSessionFactory();
		 Session session=sessionFactory.openSession();
		 //Transaction transaction=session.beginTransaction();
		// session.save(dto);
		 AgriDTO dtoFromdb=session.get(AgriDTO.class, id);
		 System.out.println(dtoFromdb);
		// transaction.commit();
		 session.close();
		 sessionFactory.close();
	}

}
