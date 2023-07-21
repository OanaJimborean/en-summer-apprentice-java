package com.java.project.endava.EndavaProject.controller;

import com.java.project.endava.EndavaProject.model.Orders;
import com.java.project.endava.EndavaProject.repository.OrderRepository;
import com.java.project.endava.EndavaProject.serviceImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/orders")
@RestController
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;
    @Autowired
    private OrderRepository orderRepository;



    @GetMapping("/get")
    public List<Orders> getAllOrders(){
        return orderService.getOrders();
    }

    @PostMapping("/add")
    public Orders addNewOrder(@RequestBody Orders order) {
        return  orderService.addOrder(order);
    }


}
