package com.java.project.endava.EndavaProject.controller;

import com.java.project.endava.EndavaProject.dto.EventDTO;
import com.java.project.endava.EndavaProject.mapper.EventMapper;
import com.java.project.endava.EndavaProject.model.Event;
import com.java.project.endava.EndavaProject.serviceImpl.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<EventDTO> getEventByVenueIDAndCategoryType(@RequestParam Integer venueID, @RequestParam String eventType){
        List<Event> events = eventService.getEventByVenueIDAndEventType(venueID, eventType);
        return events.stream().map(EventMapper::eventToEventDTO).collect(Collectors.toList());
    }




}
