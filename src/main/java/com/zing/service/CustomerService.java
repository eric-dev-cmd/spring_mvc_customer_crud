/**
 * 
 */
package com.zing.service;

import java.util.List;

import com.zing.entity.Customer;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
public interface CustomerService {
	
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	/**
	 * @param theId
	 * @return
	 */
	public Customer getCustomer(int theId);
	/**
	 * @param theId
	 */
	public void deleteCustomer(int theId);
}
