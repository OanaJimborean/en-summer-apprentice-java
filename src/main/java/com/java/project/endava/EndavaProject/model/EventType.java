package com.java.project.endava.EndavaProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "EventType")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventTypeID")
    private Integer eventTypeID;

    @Column(name = "EventTypeName")
    private String eventTypeName;

}
