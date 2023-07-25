package com.java.project.endava.EndavaProject.controller;

import com.java.project.endava.EndavaProject.dto.OrderDTO;
import com.java.project.endava.EndavaProject.model.Orders;
import com.java.project.endava.EndavaProject.model.TicketCategory;
import com.java.project.endava.EndavaProject.serviceImpl.OrderServiceImpl;
import com.java.project.endava.EndavaProject.serviceImpl.TicketCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(path = "/orders")
@RestController
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private TicketCategoryServiceImpl ticketCategoryServiceImpl;



    @GetMapping("/get")
    public List<Orders> getAllOrders(){
        return orderService.getOrders();
    }

    @GetMapping("/getByUserID/{customerID}")
    public List<OrderDTO> getOrdersByID(@PathVariable Integer customerID){
        List<Orders> orders = orderService.getOrderByID(customerID);
        return orders.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private OrderDTO convertToDto(Orders order){
        return new OrderDTO(
                //order.getOrderID(),
                //order.getCustomerID().getCustomerID(),
                order.getTicketCategoryID().getTicketCategoryID(),
                order.getOrderedAt(),
                order.getNumberOfTickets(),
                order.getTotalPrice(),
                order.getTicketCategoryID().getEventID().getEventID()


        );
    }

    @PostMapping("/{customerID}")
    public OrderDTO addOrder(@RequestBody OrderDTO orderRequestDTO,@PathVariable Integer customerID ) {

        TicketCategory ticketCategory = ticketCategoryServiceImpl.getTicketCategoryById(orderRequestDTO.getTicketCategoryID());
        float totalPrice = orderRequestDTO.getNumberOfTickets() * ticketCategory.getPrice();

        OrderDTO orderDTO = new OrderDTO();
        LocalDateTime localDateTime = LocalDateTime.now();

        orderDTO.setEventID(orderRequestDTO.getEventID());
        orderDTO.setTicketCategoryID(orderRequestDTO.getTicketCategoryID());
        orderDTO.setOrderedAt(localDateTime);
        orderDTO.setNumberOfTickets(orderRequestDTO.getNumberOfTickets());
        orderDTO.setTotalPrice(totalPrice);
        orderService.saveOrder(orderDTO,customerID);

        return orderDTO;
    }




}
