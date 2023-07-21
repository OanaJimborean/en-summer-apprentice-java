package com.java.project.endava.EndavaProject.controller;

import com.java.project.endava.EndavaProject.model.Customer;
import com.java.project.endava.EndavaProject.serviceImpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/api/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getCustomers();
    }
}
