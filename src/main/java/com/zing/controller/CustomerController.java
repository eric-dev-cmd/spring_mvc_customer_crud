/**
 * 
 */
package com.zing.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zing.dao.CustomerDAO;
import com.zing.entity.Customer;
import com.zing.service.CustomerService;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/list")
	public String listCutomers(Model theModel) {
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
			
}
