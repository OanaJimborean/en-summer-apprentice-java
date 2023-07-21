package com.java.project.endava.EndavaProject.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@Entity
@NoArgsConstructor
@Table(name = "event")


public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventID")
    private Integer eventID;

    @ManyToOne
    @JoinColumn(name = "VenueID", referencedColumnName = "VenueID")
    private Venue venueID;

    @ManyToOne
    @JoinColumn(name = "EventTypeID", referencedColumnName = "EventTypeID")
    private EventType eventTypeID;

    @Column(name = "EventDescription")
    private String eventDescription;

    @Column(name = "EventName")
    private String eventName;

    @Column(name = "StartDate")
    private LocalDateTime startDate;

    @Column(name = "EndDate")
    private LocalDateTime endDate;
}
