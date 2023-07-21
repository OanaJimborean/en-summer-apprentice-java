package com.java.project.endava.EndavaProject.serviceImpl;

import com.java.project.endava.EndavaProject.dao.OrderDAO;
import com.java.project.endava.EndavaProject.model.Orders;
import com.java.project.endava.EndavaProject.repository.OrderRepository;
import com.java.project.endava.EndavaProject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    OrderDAO orderDAO;
    @Override
    public List<Orders> getOrders() {
        return (List<Orders>) orderRepository.findAll();
    }

    public Orders addOrder(Orders order) {
        return orderRepository.save(order);
    }



}
