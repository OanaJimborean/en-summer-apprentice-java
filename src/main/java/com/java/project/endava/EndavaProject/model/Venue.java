package com.java.project.endava.EndavaProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "venue")
public class Venue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VenueID")
    private Integer venueID;

    @Column(name = "Location")
    private String location;

    @Column(name = "Type")
    private String type;

    @Column(name = "Capacity")
    private Integer capacity;
}
