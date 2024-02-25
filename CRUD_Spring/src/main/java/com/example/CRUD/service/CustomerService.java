package com.example.CRUD.service;

import com.example.CRUD.model.Customer;
import com.example.CRUD.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

  // Method GET BY ID
  public Customer getCustomerById(Long id){
    return customerRepository.findById(id).orElse(null);
  }

  // Method UPDATE
  public Customer updateCustomer(Long id, Customer customer){

    Optional<Customer> optionalCustomer = customerRepository.findById(id);

    if(optionalCustomer.isPresent()){

      Customer existingCustomer = optionalCustomer.get();
      existingCustomer.setEmail(customer.getEmail());
      existingCustomer.setName(customer.getName());
      existingCustomer.setPhone(customer.getPhone());

      return customerRepository.save(existingCustomer);
    }

    return null;
  }

}
