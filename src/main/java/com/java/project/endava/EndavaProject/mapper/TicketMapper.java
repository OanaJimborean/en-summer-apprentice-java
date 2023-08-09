package com.java.project.endava.EndavaProject.mapper;

import com.java.project.endava.EndavaProject.dto.TicketCategoryDTO;
import com.java.project.endava.EndavaProject.model.TicketCategory;

public class TicketMapper {

    public static TicketCategoryDTO req(TicketCategory category){
        TicketCategoryDTO ticketCategoryDTO=new TicketCategoryDTO();
        ticketCategoryDTO.setTicketCategoryID(category.getTicketCategoryID());
        ticketCategoryDTO.setPrice(category.getPrice());
        ticketCategoryDTO.setDescription(category.getDescription());
        ticketCategoryDTO.setEventID(category.getEventID().getEventID());
        return ticketCategoryDTO;
    }
}
