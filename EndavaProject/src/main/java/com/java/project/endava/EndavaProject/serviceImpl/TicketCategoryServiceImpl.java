package com.java.project.endava.EndavaProject.serviceImpl;

import com.java.project.endava.EndavaProject.model.TicketCategory;
import com.java.project.endava.EndavaProject.repository.TicketCategoryRepository;
import com.java.project.endava.EndavaProject.service.TicketCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryServiceImpl implements TicketCategoryService {


    private final TicketCategoryRepository ticketCategoryRepository;
    @Autowired
    public TicketCategoryServiceImpl(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    public TicketCategory getTicketCategoryById(Integer id){
        return ticketCategoryRepository.findTicketCategoryByTicketCategoryID(id);
    }
}
