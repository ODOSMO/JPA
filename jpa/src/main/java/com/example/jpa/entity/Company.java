package com.example.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "company")
public class Company{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private int id;

    @Column(name = "name", length = 100)
    private String name;

    @ManyToOne
    @JoinColumn( name="statusId_fk" ,nullable=false, foreignKey=@ForeignKey(name = "statusId_fk"))
    private CompanyStatus companyStatus;

    public Company(){
    }

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<Contact> contacts;

    public Company(String name) {
        this.name = name;
    }
}
