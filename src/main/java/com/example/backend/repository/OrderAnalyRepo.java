package com.example.backend.repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.entity.OrderAnaylisis;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface OrderAnalyRepo extends JpaRepository<OrderAnaylisis, Integer> {

}