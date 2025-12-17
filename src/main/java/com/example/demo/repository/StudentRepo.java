package com.example.demo.repository;
import org.springframework.data.jpa.repository.jpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Student;

@repository
public interface StudentRepo extends jpaRepository<Student,Long>{

}