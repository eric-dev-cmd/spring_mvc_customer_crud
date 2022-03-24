/**
 * 
 */
package com.zing.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zing.entity.Customer;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Customer> getCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
		List<Customer> customers =  theQuery.getResultList();
		System.out.println("customers" + customers);
		return customers;
	}

	public void saveCustomer(Customer customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(customer);
		
	}

}
