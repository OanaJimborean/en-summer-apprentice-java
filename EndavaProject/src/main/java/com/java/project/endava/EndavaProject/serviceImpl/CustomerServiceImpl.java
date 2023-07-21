package com.java.project.endava.EndavaProject.serviceImpl;

import com.java.project.endava.EndavaProject.model.Customer;
import com.java.project.endava.EndavaProject.repository.CustomerRepository;
import com.java.project.endava.EndavaProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }



}
