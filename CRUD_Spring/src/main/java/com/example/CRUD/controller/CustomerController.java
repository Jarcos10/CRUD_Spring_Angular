package com.example.CRUD.controller;

import com.example.CRUD.model.Customer;
import com.example.CRUD.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @PostMapping("/customer")
  public Customer postCustomer(@RequestBody Customer customer){
    return customerService.postCustomer(customer);
  }

  @GetMapping("/customers")
  public List<Customer> getAllCustomers(){
    return customerService.getAllCustomers();
  }

  @DeleteMapping("/customer/{id}")
  public void deleteCustomer(@PathVariable Long id){
    customerService.deleteCustomer(id);
  }

}
