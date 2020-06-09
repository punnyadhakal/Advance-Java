 package com.customerdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customerdetails.model.CustomerDetails;
import com.customerdetails.repository.CustomerRepository;


@Service
@Transactional
public class CustomerServiceImpl  implements CustomerService{

	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void saveCustomerInfo(CustomerDetails customerDetails) {
	customerRepository.saveCustomerInfo(customerDetails);
		 
	}

	@Override
	public void updateCustomerInfo(CustomerDetails customerDetails) {
		customerRepository.updateCustomerInfo(customerDetails);
		
	}

	@Override
	public void deleteCutomerInfo(int id) {
		customerRepository.deleteCustomerInfo(id);
		
	}

	@Override
	public List<CustomerDetails> getAllCustomerInfo() {
		return customerRepository.getAllCustomerInfo();
	}

	@Override
	public CustomerDetails getCustomerById(int id) {
		
		return customerRepository.getCustomerById(id);
	}
	
	
		
		
	

	
		
	}


