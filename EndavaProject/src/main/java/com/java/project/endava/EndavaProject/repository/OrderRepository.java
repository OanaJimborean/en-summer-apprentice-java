package com.java.project.endava.EndavaProject.repository;

import com.java.project.endava.EndavaProject.model.Customer;
import com.java.project.endava.EndavaProject.model.Event;
import com.java.project.endava.EndavaProject.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

    List<Orders> findOrdersByCustomerID_CustomerID(Integer customerID);
}
