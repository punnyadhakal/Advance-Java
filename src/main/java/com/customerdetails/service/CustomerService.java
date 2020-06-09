package com.customerdetails.service;

import java.util.List;

import com.customerdetails.model.CustomerDetails;

public interface CustomerService {

	
	public void saveCustomerInfo(CustomerDetails customerDetails);
	
	
	public void updateCustomerInfo(CustomerDetails customerDetails);
	
	public  void deleteCutomerInfo(int id);
	 
	List<CustomerDetails> getAllCustomerInfo();
	
	
	public CustomerDetails getCustomerById(int id);
	
	
	
}
