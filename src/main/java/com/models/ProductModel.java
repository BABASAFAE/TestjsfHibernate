package com.models;
import java.util.List;

import com.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ProductModel {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Product> findAll() {
		System.out.println("sbdfhoe");
		List<Product> products = null;
		Session session = null;
		Transaction transaction = null;
		System.out.println("sbdfhoe");
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			org.hibernate.query.Query query = session.createQuery("from Product");
			products = query.getResultList();
			transaction.commit();
			System.out.println("sbdfhoe");
		} catch (Exception e) {
			products = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return products;
	}

}