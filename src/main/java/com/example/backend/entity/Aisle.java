package com.example.backend.entity;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
@Entity
@Table(name = "aisles")


public class Aisle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String aisle;

    public Aisle(){

    }
    public Aisle(Long id,String aisle) {
        this.aisle=aisle;
        
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return aisle;
    }

    public void setName(String aisle) {
        this.aisle =aisle;
    }

   

}