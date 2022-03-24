/**
 * 
 */
package com.zing.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 48 - Tran Trung Vinh - 18079461
 *
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
	@RequestMapping("/list")
	public String listCutomers(Model theModel) {
		return "list-customers";
	}
			
}
