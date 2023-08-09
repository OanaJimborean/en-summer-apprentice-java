package com.java.project.endava.EndavaProject.mapper;

import com.java.project.endava.EndavaProject.dto.EventDTO;
import com.java.project.endava.EndavaProject.dto.TicketCategoryDTO;
import com.java.project.endava.EndavaProject.dto.VenueDTO;
import com.java.project.endava.EndavaProject.model.Event;
import com.java.project.endava.EndavaProject.model.TicketCategory;

import java.util.ArrayList;
import java.util.List;

public class EventMapper {
    public static EventDTO eventToEventDTO(Event event){
        if(event == null){
            return null;
        }
        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventID(event.getEventID());
        eventDTO.setVenueDTO(new VenueDTO(event.getVenueID()));
        eventDTO.setEventTypeName(event.getEventTypeID().getEventTypeName());
        eventDTO.setEventDescription(event.getEventDescription());
        eventDTO.setEventName(event.getEventName());
        eventDTO.setStartDate(event.getStartDate());
        eventDTO.setEndDate(event.getEndDate());
        List<TicketCategoryDTO> ticketCategoryDTOS=new ArrayList<>();
        for(TicketCategory ticketCategory:event.getTicketCategoryList()){
            TicketCategoryDTO ticketCategoryDTO=new TicketCategoryDTO(ticketCategory);
            ticketCategoryDTOS.add(ticketCategoryDTO);
        }
        eventDTO.setTicketCategory(ticketCategoryDTOS);

        return eventDTO;

    }
}
