package com.example.CRUD.controller;

import com.example.CRUD.model.Customer;
import com.example.CRUD.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @PostMapping("/customer")
  public Customer postCustomer(@RequestBody Customer customer){
    return customerService.postCustomer(customer);
  }

}
