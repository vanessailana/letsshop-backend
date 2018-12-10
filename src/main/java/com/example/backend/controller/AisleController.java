package com.example.backend.controller;
import com.example.backend.entity.Aisle;
import com.example.backend.repository.AisleRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
public class AisleController {

 @Autowired
    AisleRepo aisleRepo;

    @GetMapping("/aisles")
    public List<Aisle> getAllAisles() {
    	System.out.println(aisleRepo.findAll());
        return aisleRepo.findAll();

    }
 
      @PutMapping("/editAisle")
   public Aisle update(@RequestBody Aisle aisle)
    {
        return aisleRepo.save(aisle);
    }


}