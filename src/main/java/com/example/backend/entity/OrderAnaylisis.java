package com.example.backend.entity;

import javax.persistence.ManyToOne;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import java.util.List;


import org.springframework.web.multipart.MultipartFile;

import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
@Entity
@Table(name = "orders_details")
public class OrderAnaylisis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;


    private int user_id;

   private String eval_set;

    private int order_number;
    
   private int order_dow;
   
 private int order_hour_of_day;

 private int days_since_prior_order;

  

  public int getId() {
    return order_id;
  }

    public void setId(int order_id) {
    this.order_id=order_id;
    return;
  }

 public int getUID() {
    return user_id;
  }

    public void setUID(int user_id) {
    this.user_id=user_id;
    return;
  }

 

  public String getEvalSet(){
    return eval_set;
  }

   public void setEvalSet(String eval_set){
    this.eval_set=eval_set;
    return;
  }


  public int getOrderNum() {
  	return order_number;
  }

  public void setOrderNum(int order_number) {
  	this.order_number=order_number;
  	return;
  }
  public int getOrderDow() {
    return order_dow;
  }

  public void setOrderDow(int order_dow) {
    this.order_dow=order_dow;
    return;
  }
 
    public int getOrderHour() {
        return order_hour_of_day;
    }

    public void setOrderHour(int order_hour_of_day) {
        this.order_hour_of_day=order_hour_of_day;
        return;
    }
  public int getDaysSincePrior() {
        return days_since_prior_order;
    }

    public void setDaysSincePrior(int days_since_prior_order) {
        this.days_since_prior_order=days_since_prior_order;
        return;
    }

 

}


