package com.java.project.endava.EndavaProject.dao;

import com.java.project.endava.EndavaProject.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO  extends JpaRepository<Orders, Integer> {
}
