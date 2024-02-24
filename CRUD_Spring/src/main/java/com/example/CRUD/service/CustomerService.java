package com.example.CRUD.service;

import com.example.CRUD.model.Customer;
import com.example.CRUD.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  // Method POST
  public Customer postCustomer(Customer customer){
    return customerRepository.save(customer);
  }

  // Method GET
  public List<Customer> getAllCustomers(){
    return customerRepository.findAll();
  }

  // Method DELETE
  public void deleteCustomer(Long id){
    customerRepository.deleteById(id);
  }


}
