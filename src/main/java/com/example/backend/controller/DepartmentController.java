package com.example.backend.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import javax.validation.Valid;
import com.example.backend.entity.Department;
import com.example.backend.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;
@RestController
@RequestMapping("/api")

 @CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
public class DepartmentController {

 @Autowired
    DepartmentRepo departmentRepo;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
    	System.out.println(departmentRepo.findAll());
        return departmentRepo.findAll();

    }

    @PutMapping("/editDepartment")
   public Department update(@RequestBody Department department)
    {
        return departmentRepo.save(department);
    }


  

}