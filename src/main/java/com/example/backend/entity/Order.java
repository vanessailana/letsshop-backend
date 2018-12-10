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
@Table(name = "orders_done")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long order_id;


    private int user_order_number;

   private String product_name;

    private boolean active=true;
    
  
   @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name="product_name",referencedColumnName="product_name", insertable=false, updatable=false)
   private Product prod;

    

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public String getProductName(){
    return product_name;
  }

   public void setProductName(String product_name){
    this.product_name=product_name;
    return;
  }


  public int getOrderNum() {
  	return user_order_number;
  }

  public void setOrderNum(int user_order_number) {
  	this.user_order_number=user_order_number;
  	return;
  }

 
    public Long getId() {
        return order_id;
    }

    public void setId(Long order_id) {
        this.order_id = order_id;
        return;
    }

 

public Product getProduct(){
      return prod;
    }

   public void setProduct(Product product){
    this.prod=prod;
    return;
  }




  

}