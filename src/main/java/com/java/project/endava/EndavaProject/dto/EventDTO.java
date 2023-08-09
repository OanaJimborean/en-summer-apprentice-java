package com.java.project.endava.EndavaProject.dto;

import com.java.project.endava.EndavaProject.model.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {

    private Integer eventID;
    private String eventDescription;
    private String eventName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private VenueDTO venueDTO;
    private String eventTypeName;
    private List<TicketCategoryDTO> ticketCategory;

    public EventDTO (Event event){

        this.eventID=event.getEventID();
        this.eventName=event.getEventName();
        this.eventDescription=event.getEventDescription();
        this.startDate=event.getStartDate();
        this.endDate=event.getEndDate();
        this.venueDTO=new VenueDTO();
        this.eventTypeName = event.getEventTypeID().getEventTypeName();
        this.ticketCategory=new ArrayList<>();


    }


}
