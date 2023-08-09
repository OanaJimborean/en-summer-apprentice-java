package com.java.project.endava.EndavaProject.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "event")

public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventID")
    private Integer eventID;

    @OneToMany(mappedBy = "eventID")
    @JsonManagedReference
    private List<TicketCategory> ticketCategoryList;

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
