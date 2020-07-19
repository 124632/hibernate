package com.sushma.sushmaapp.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.sus.sushma.HibSingleton;
import com.sushma.sushmaapp.dto.PrinterDTO;

public class PrinterDAOImpl implements PrinterDAO {

	@Override
	public void savePrinter(PrinterDTO printerDTO) {
		Session session=null;
		try {
			session=HibSingleton.getFactory().openSession();
			session.beginTransaction();
			session.save(printerDTO);
			session.getTransaction().commit();
			if(Objects.nonNull(printerDTO)) {
				System.out.println("data is stored in database successfully");
			}
			else {
				System.out.println("data is not stored in database");
			}
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			if(Objects.nonNull(session)) {
				session.close();
			}
			else {
				System.out.println("session not closed properly");
			}
		}
	}

	@Override
	public PrinterDTO getPrinterById(int id) {
		PrinterDTO dtoFromDb=null;
		String hql="from PrinterDTO where  printerId='"+id+"'";
		Session session=null;
		
		try {
			 session = HibSingleton.getFactory().openSession();
			//preparing the query
		Query query=session.createQuery(hql);
			dtoFromDb =(PrinterDTO) query.uniqueResult();
			System.out.println(dtoFromDb);
		} catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			
			if(Objects.nonNull(session)) {
				session.close();
			}
		}
	   return dtoFromDb;
	}

	public String getColorByName(String name) {
		String result=null;
		String hql="select ref.printerColor from PrinterDTO ref where ref.printerName='"+name+"'";
		Session session=null;
		
		try {
			 session = HibSingleton.getFactory().openSession();
			//preparing the query
		Query query=session.createQuery(hql);
      result = (String) query.uniqueResult();
			System.out.println(result);
		} catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			
			if(Objects.nonNull(session)) {
				session.close();
			}
		}
	   return result;
	}

	

	@Override
	public Object[] getColorAndPriceById(int id) {
		Object[] objectArray=null;
		String hql ="select ref.printerColor,ref.printerPrice from PrinterDTO ref where ref.printerId='"+id+"'";
		Session session = null;
		try {
			 session = HibSingleton.getFactory().openSession();
			//preparing the query
		Query query=session.createQuery(hql);
     objectArray = (Object[]) query.uniqueResult();
			System.out.println(objectArray);
		} catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			
			if(Objects.nonNull(session)) {
				session.close();
			}
		}
	   return objectArray;
	}

}