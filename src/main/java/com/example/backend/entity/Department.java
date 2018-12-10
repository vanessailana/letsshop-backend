package com.example.backend.entity;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
@Entity
@Table(name = "departments")


public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String departments_name;

 public Department(){

    }
    public Department(Long id,String departments_name) {
        this.departments_name=departments_name;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return departments_name;
    }

    public void setTitle(String departments_name) {
        this.departments_name =departments_name;
    }

   

}