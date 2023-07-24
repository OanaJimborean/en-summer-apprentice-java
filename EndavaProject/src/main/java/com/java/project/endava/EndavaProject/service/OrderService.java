package com.java.project.endava.EndavaProject.service;

import com.java.project.endava.EndavaProject.model.Orders;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface OrderService {
    List<Orders> getOrders();
    Orders addOrder(Orders order);

    List<Orders> getOrderByID(Integer customerID);
}
