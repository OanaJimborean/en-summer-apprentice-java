package com.java.project.endava.EndavaProject.repository;

import com.java.project.endava.EndavaProject.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
    TicketCategory findTicketCategoryByTicketCategoryID(Integer ticketCategoryID);
}
