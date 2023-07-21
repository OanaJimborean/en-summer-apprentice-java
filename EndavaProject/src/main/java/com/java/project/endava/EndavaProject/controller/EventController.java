package com.java.project.endava.EndavaProject.controller;

import com.java.project.endava.EndavaProject.model.Customer;
import com.java.project.endava.EndavaProject.model.Event;
import com.java.project.endava.EndavaProject.model.EventType;
import com.java.project.endava.EndavaProject.model.Venue;
import com.java.project.endava.EndavaProject.repository.EventRepository;
import com.java.project.endava.EndavaProject.serviceImpl.CustomerServiceImpl;
import com.java.project.endava.EndavaProject.serviceImpl.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {


    @Autowired
    public EventController(EventServiceImpl eventService){
        this.eventService = eventService;
    }
    private EventServiceImpl eventService;

    @GetMapping("/api/events")
    public List<Event> getAllEvents(){
        return eventService.getEvents();
    }

    @GetMapping("/api/getEvent")
    public List<Event> getEventsByVenueIDAndCategoryType(@RequestParam Integer venueID, @RequestParam String eventType){
        return eventService.getEventByVenueIDAndEventType(venueID,eventType);
    }


}
