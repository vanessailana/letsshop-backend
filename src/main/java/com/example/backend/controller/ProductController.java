package com.example.backend.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.validation.Valid;
import com.example.backend.entity.Product;
import com.example.backend.repository.ProductRepo;
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
public class ProductController {

 @Autowired
    ProductRepo productRepo;
    
     
    @GetMapping("/products")
    public List<Product> findAll()
    {
        return productRepo.findAll();
    }
   
 @GetMapping("/findproducts/{id}")
    @ResponseBody
    public Product findByProductId(@PathVariable("id") Long id)
    {
        return productRepo.findOne(id);
    }

     @DeleteMapping("/products/{id}")
    public List<Product> delete(@PathVariable("id") Long product_id)
    {
        productRepo.delete(product_id);
        return productRepo.findAll();
    }

     @PostMapping("/createProduct")
    public Product create(@RequestBody Product product)
    {
        return productRepo.save(product);
    }

  @PutMapping("/createProduct")
   public Product update(@RequestBody Product product)
    {
        return productRepo.save(product);
    }

}

  

