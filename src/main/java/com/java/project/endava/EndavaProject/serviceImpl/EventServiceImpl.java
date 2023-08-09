package com.java.project.endava.EndavaProject.serviceImpl;

import com.java.project.endava.EndavaProject.model.Event;
import com.java.project.endava.EndavaProject.repository.EventRepository;
import com.java.project.endava.EndavaProject.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;
    @Override
    public List<Event> getEvents() {
        return (List<Event>) eventRepository.findAll();
    }

    @Override
    public List<Event> getEventByVenueIDAndEventType(Integer venueID, String eventType) {
        List<Event> events = eventRepository.findEventsByVenueID_VenueIDAndEventTypeID_EventTypeName(venueID, eventType);
        return events;
    }


}
