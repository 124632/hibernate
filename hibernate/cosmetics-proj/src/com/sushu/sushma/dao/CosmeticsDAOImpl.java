package com.sushu.sushma.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.sushu.sushma.dto.CosmeticsDTO;
import com.sushu.sushma.dto.CosmeticsDTO;
import com.xworkz.hibutil.HibSingleton;

public class CosmeticsDAOImpl implements CosmeticsDAO {

	@Override
	public void saveCosmetics(CosmeticsDTO cosmeticsDTO) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = HibSingleton.getFactory().openSession();
			session.beginTransaction();
			session.save(cosmeticsDTO);
			session.getTransaction().commit();
			if (Objects.nonNull(cosmeticsDTO)) {
				System.out.println("data is stored in database successfully");
			} else {
				System.out.println("data is not stored in database");

			}
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
			} else {
				System.out.println("session not closed properly");
			}
		}

	}

	@Override
	public CosmeticsDTO geCosmeticsById(int id) {
		CosmeticsDTO dtoFromDb = null;
		String hql = "from CosmeticsDTO where  cosmeticsId='" + id + "'";
		Session session = null;

		try {
			session = HibSingleton.getFactory().openSession();
			// preparing the query
			Query query = session.createQuery(hql);
			dtoFromDb = (CosmeticsDTO) query.uniqueResult();
			System.out.println(dtoFromDb);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {

			if (Objects.nonNull(session)) {
				session.close();
			}
		}
		return dtoFromDb;
	}

	@Override
	public String getColorByName(String name) {
		String result = null;
		String hql = "select ref.cosmeticsColor from CosmeticsDTO ref where ref.cosmeticsName='" + name + "'";
		Session session = null;
		try {
			session = HibSingleton.getFactory().openSession();
			// preparing the query
			Query query = session.createQuery(hql);
			result = (String) query.uniqueResult();
			System.out.println(result);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
			}
		}
		return result;
	}

	@Override
	public Object[] getColorAndPriceById(int id) {
		Object[] objectArray = null;
		String hql = "select ref.cosmeticsColor,ref.cosmeticsPrice from CosmeticsDTO ref where ref.cosmeticsId='" + id
				+ "'";
		Session session = null;
		try {
			session = HibSingleton.getFactory().openSession();
			// preparing the query
			Query query = session.createQuery(hql);
			objectArray = (Object[]) query.uniqueResult();
			System.out.println(objectArray);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
			}
		}
		return objectArray;
	}

}
