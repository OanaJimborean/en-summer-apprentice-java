package com.java.project.endava.EndavaProject.wrapper;

import com.java.project.endava.EndavaProject.model.Customer;
import com.java.project.endava.EndavaProject.model.EventType;
import com.java.project.endava.EndavaProject.model.TicketCategory;
import com.java.project.endava.EndavaProject.model.Venue;

import java.time.LocalDateTime;

public class OrderWrapper {

    Integer id;
    Customer customerID;
    TicketCategory ticketCategory;
    LocalDateTime orderedAt;
    Integer numberOfTickets;
    Float totalPrice;

    public OrderWrapper(Integer id, Customer customerID, TicketCategory ticketCategory, LocalDateTime orderedAt, Integer numberOfTickets, Float totalPrice) {
        this.id = id;
        this.customerID = customerID;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public OrderWrapper(Integer id, Customer customerID, Float totalPrice) {
        this.id = id;
        this.customerID = customerID;
        this.totalPrice = totalPrice;
    }
}
