/**
 * 
 */
package com.zing.dao;

import java.util.List;

import com.zing.entity.Customer;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);

}
