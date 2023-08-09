package com.java.project.endava.EndavaProject.service;

import com.java.project.endava.EndavaProject.model.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> getOrders();
    Orders addOrder(Orders order);

    List<Orders> getOrderByID(Integer customerID);
}
