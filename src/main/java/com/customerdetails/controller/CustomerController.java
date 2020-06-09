
package com.customerdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.customerdetails.model.CustomerDetails;
import com.customerdetails.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "customer_form", method = RequestMethod.GET)
	public String getCustomerDetails() {
		return "addCustomer";
	}

	@RequestMapping(value = "customer_edit", method = RequestMethod.GET)
	public String getCustomerEditForm(@RequestParam int id, Model model) {
		model.addAttribute("cus", customerService.getCustomerById(id));
		return "editCustomer";
	}

	@RequestMapping(value = "save_customer", method = RequestMethod.POST)
	public String saveCustomerInfo(@ModelAttribute CustomerDetails customerDetails) {
		customerService.saveCustomerInfo(customerDetails);
		return "redirect:/customer_list";
	}

	@RequestMapping(value = "update_customer", method = RequestMethod.POST)
	public String updateCustomerInfo(@ModelAttribute CustomerDetails customerDetails) {
		customerService.updateCustomerInfo(customerDetails);
		return "redirect:/customer_list";

	}

	@RequestMapping(value = { "/", "customer_list" }, method = RequestMethod.GET)
	public String getCustomerList(Model model) {
		model.addAttribute("customers", customerService.getAllCustomerInfo());
		return "listCustomer";
	}

	@RequestMapping(value = "customer_delete", method = RequestMethod.GET)
	public String deleteCustomerInfo(@RequestParam int id) {
		customerService.deleteCutomerInfo(id);
		return "redirect:/customer_list";
	}

}
