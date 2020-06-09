package com.customerdetails.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customerdetails.model.CustomerDetails;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveCustomerInfo(CustomerDetails customerDetails) {
		Session session =getSession();
		session.save(customerDetails);
		getSession().flush();

	}

	@Override
	public void updateCustomerInfo(CustomerDetails customerDetails) {
		Session session =getSession();
		session.update(customerDetails);
		getSession().flush();

	}

	@Override
	public void deleteCustomerInfo(int id) {
		CustomerDetails customerDetails = getCustomerById(id);
		if (customerDetails != null) {
			Session session=getSession(); 
					session.delete(customerDetails);
			getSession().flush();

		}

	}

	@Override
	public List<CustomerDetails> getAllCustomerInfo() {
		Criteria criteria = getSession().createCriteria(CustomerDetails.class);
		return criteria.list();
	}

	@Override
	public CustomerDetails getCustomerById(int id) {
		return (CustomerDetails) getSession().get(CustomerDetails.class, id);
	}

	public Session getSession() {
		Session session = sessionFactory.openSession();
		if (session == null) {
			session = sessionFactory.getCurrentSession();
		}
		return session;

	}

}
