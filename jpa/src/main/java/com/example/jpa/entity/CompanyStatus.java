package com.example.jpa.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "companystatus")
public class CompanyStatus {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public CompanyStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
