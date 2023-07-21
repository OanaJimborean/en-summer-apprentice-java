package com.java.project.endava.EndavaProject.repository;

import com.java.project.endava.EndavaProject.model.Customer;
import com.java.project.endava.EndavaProject.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Integer> {
}
