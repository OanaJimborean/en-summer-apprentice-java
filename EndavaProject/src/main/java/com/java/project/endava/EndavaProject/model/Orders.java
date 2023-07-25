package com.java.project.endava.EndavaProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private Integer orderID;

    @ManyToOne
    @JoinColumn (name = "CustomerID", referencedColumnName = "CustomerID")
    private Customer customerID;

    @ManyToOne
    @JoinColumn (name = "TicketCategoryID", referencedColumnName = "TicketCategoryID")
    private TicketCategory ticketCategoryID;

    @Column(name = "OrderedAt")
    private LocalDateTime orderedAt;

    @Column(name = "NumberOfTickets")
    private Integer numberOfTickets;

    @Column(name = "TotalPrice")
    private Float totalPrice;


}
