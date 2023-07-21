package com.java.project.endava.EndavaProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "ticket_category")

public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TicketCategoryID")
    private Integer ticketCategoryID;

    @ManyToOne
    @JoinColumn(name = "EventID", referencedColumnName = "EventID")
    private Event eventID;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private Float price;


}
