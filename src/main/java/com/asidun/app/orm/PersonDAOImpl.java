package com.asidun.app.orm;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.asidun.app.orm.entity.Person;

public class PersonDAOImpl implements PersonDAO {
	
	private final SessionFactory sessionFactory;
	
	public PersonDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Person p){
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> list(){
		Session session = this.sessionFactory.openSession();
		List<Person> personList = session.createQuery("fromPerson").list();
		session.close();
		return personList;
	}
	
}
