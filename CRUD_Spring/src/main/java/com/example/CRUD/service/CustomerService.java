package com.example.CRUD.service;

import com.example.CRUD.model.Customer;
import com.example.CRUD.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public Customer postCustomer(Customer customer){
    return customerRepository.save(customer);
  }


}
