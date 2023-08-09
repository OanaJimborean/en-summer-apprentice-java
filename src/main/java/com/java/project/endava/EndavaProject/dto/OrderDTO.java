package com.java.project.endava.EndavaProject.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@JsonSerialize
public class OrderDTO {
    Integer ticketCategoryID;
    LocalDateTime orderedAt;
    Integer numberOfTickets;
    Float totalPrice;
    Integer eventID;

    public OrderDTO(Integer ticketCategoryID, LocalDateTime orderedAt, Integer numberOfTickets, Float totalPrice, Integer eventID) {

        this.ticketCategoryID = ticketCategoryID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.eventID = eventID;

    }

    public OrderDTO() {

    }
}
