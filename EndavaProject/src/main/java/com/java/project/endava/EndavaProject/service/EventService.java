package com.java.project.endava.EndavaProject.service;

import com.java.project.endava.EndavaProject.model.Customer;
import com.java.project.endava.EndavaProject.model.Event;
import com.java.project.endava.EndavaProject.model.EventType;
import com.java.project.endava.EndavaProject.model.Venue;

import java.util.List;

public interface EventService {
    List<Event> getEvents();
    List<Event> getEventByVenueIDAndEventType(Integer venueID, String eventType);
}
