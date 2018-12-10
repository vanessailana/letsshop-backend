package com.example.backend.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.validation.Valid;
import com.example.backend.entity.Order;
import com.example.backend.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/api")

 @CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*", maxAge = 3600)
public class OrderController {

 @Autowired
    OrderRepo orderRepo;
    
     
    @GetMapping("/orders")
    public List<Order> findAll()
    {
        return orderRepo.findAll();
    }
   


     @DeleteMapping("/orders/{id}")
    public List<Order> delete(@PathVariable("id") Long order_id)
    {
        orderRepo.delete(order_id);
        return orderRepo.findAll();
    }

     @PostMapping("/createOrder")
    public Order create(@RequestBody Order order)
    {
        return  orderRepo.save(order);
    }

  @PutMapping("/createOrder")
   public Order update(@RequestBody Order order)
    {
        return orderRepo.save(order);
    }

}

  