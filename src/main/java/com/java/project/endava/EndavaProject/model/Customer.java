package com.java.project.endava.EndavaProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Table(name = "customer")
@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerID")
    private int customerID;

    @Column(name = "CustomerName")
    private String customerName;

    @Column(name = "Email")
    private String email;





}
