package com.java.project.endava.EndavaProject.dto;

import com.java.project.endava.EndavaProject.model.TicketCategory;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TicketCategoryDTO {
    private Integer ticketCategoryID;
    private Integer eventID;
    private String description;
    private Float price;

    public TicketCategoryDTO(TicketCategory ticketCategory) {
        this.ticketCategoryID = ticketCategory.getTicketCategoryID();
        this.description = ticketCategory.getDescription();
        this.eventID = ticketCategory.getEventID().getEventID();
        this.price = ticketCategory.getPrice();
    }

}
