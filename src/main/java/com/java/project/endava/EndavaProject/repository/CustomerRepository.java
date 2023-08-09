package com.java.project.endava.EndavaProject.repository;

import com.java.project.endava.EndavaProject.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer findCustomerByCustomerID(Integer CustomerID);
}
