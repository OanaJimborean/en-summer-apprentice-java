package com.java.project.endava.EndavaProject.controller;

import com.java.project.endava.EndavaProject.dto.TicketCategoryDTO;
import com.java.project.endava.EndavaProject.mapper.TicketMapper;
import com.java.project.endava.EndavaProject.model.TicketCategory;
import com.java.project.endava.EndavaProject.serviceImpl.TicketCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TicketCategoryController {

    @Autowired
    public TicketCategoryController(TicketCategoryServiceImpl ticketCategoryService){
        this.ticketCategoryService = ticketCategoryService;
    }

    private TicketCategoryServiceImpl ticketCategoryService;

    @GetMapping("/api/ticketCategories")
    public List<TicketCategoryDTO> getAllTicketCategories() {
        List<TicketCategory> ordersUser=ticketCategoryService.getTicketCategories();
        return ordersUser.stream().map(TicketMapper::req).collect(Collectors.toList());
    }
}
