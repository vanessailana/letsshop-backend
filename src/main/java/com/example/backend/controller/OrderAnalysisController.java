package com.example.backend.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.validation.Valid;
import com.example.backend.entity.OrderAnaylisis;
import com.example.backend.repository.OrderAnalyRepo;
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
public class OrderAnalysisController {

 @Autowired
    OrderAnalyRepo orderRepo;
    
     
    @GetMapping("/order_details")
    public List<OrderAnaylisis> findAll()
    {
        return orderRepo.findAll();
    }
   


     @DeleteMapping("/order_details/{id}")
    public List<OrderAnaylisis> delete(@PathVariable("id") int order_id)
    {
        orderRepo.delete(order_id);
        return orderRepo.findAll();
    }

     @PostMapping("/createOrderDetails")
    public OrderAnaylisis create(@RequestBody OrderAnaylisis order)
    {
        return  orderRepo.save(order);
    }

  @PutMapping("/createOrderDetails")
   public OrderAnaylisis update(@RequestBody OrderAnaylisis order)
    {
        return orderRepo.save(order);
    }

}
