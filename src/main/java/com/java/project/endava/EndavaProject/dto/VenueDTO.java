package com.java.project.endava.EndavaProject.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.java.project.endava.EndavaProject.model.Venue;
import lombok.Data;

@Data
@JsonSerialize
public class VenueDTO {

    public VenueDTO() {

    }
    private Integer venueID;
    private String location;
    private String type;
    private Integer capacity;

    public VenueDTO(Venue venue) {
        this.venueID = venue.getVenueID();
        this.location = venue.getLocation();
        this.type = venue.getType();
        this.capacity = venue.getCapacity();
    }
}
