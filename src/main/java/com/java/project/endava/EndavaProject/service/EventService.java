package com.java.project.endava.EndavaProject.service;

import com.java.project.endava.EndavaProject.model.Event;

import java.util.List;

public interface EventService {
    List<Event> getEvents();
    List<Event> getEventByVenueIDAndEventType(Integer venueID, String eventType);
}
