package com.customerdetails.repository;

import java.util.List;

import com.customerdetails.model.CustomerDetails;

public interface CustomerRepository {

	public void saveCustomerInfo(CustomerDetails customerDetails);

	public void updateCustomerInfo(CustomerDetails customerDetails);

	public void deleteCustomerInfo(int id);

	List<CustomerDetails> getAllCustomerInfo();

	public CustomerDetails getCustomerById(int id);
}
