package com.java.project.endava.EndavaProject.serviceImpl;

import com.java.project.endava.EndavaProject.dao.OrderDAO;
import com.java.project.endava.EndavaProject.dto.OrderDTO;
import com.java.project.endava.EndavaProject.model.Customer;
import com.java.project.endava.EndavaProject.model.Orders;
import com.java.project.endava.EndavaProject.model.TicketCategory;
import com.java.project.endava.EndavaProject.repository.CustomerRepository;
import com.java.project.endava.EndavaProject.repository.OrderRepository;
import com.java.project.endava.EndavaProject.repository.TicketCategoryRepository;
import com.java.project.endava.EndavaProject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    OrderDAO orderDAO;

    @Autowired
    TicketCategoryRepository ticketCategoryRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Orders> getOrders() {
        return (List<Orders>) orderRepository.findAll();
    }

    public Orders addOrder(Orders order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Orders> getOrderByID(Integer customerID) {
        return orderRepository.findOrdersByCustomerID_CustomerID(customerID);
    }

    public void saveOrder(OrderDTO orderDTO, Integer customerID) {
        Orders order = new Orders();

        TicketCategory ticketCategoryOrdered=ticketCategoryRepository.
                findTicketCategoryByTicketCategoryID(orderDTO.getTicketCategoryID());

        Customer customer=customerRepository.findCustomerByCustomerID(customerID);
        order.setCustomerID(customer);
        order.setTicketCategoryID(ticketCategoryOrdered);
        order.setOrderedAt(orderDTO.getOrderedAt());
        order.setNumberOfTickets(orderDTO.getNumberOfTickets());
        order.setTotalPrice(orderDTO.getTotalPrice());
        System.out.println(order);

        orderRepository.save(order);
    }




}
