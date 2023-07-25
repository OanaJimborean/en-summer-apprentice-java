package com.java.project.endava.EndavaProject.repository;

import com.java.project.endava.EndavaProject.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    List<Event> findEventsByVenueID_VenueIDAndEventTypeID_EventTypeName(Integer venueID, String eventType);
}
