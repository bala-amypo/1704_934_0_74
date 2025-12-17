package com.example.demo.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
@Service
public class StudentService implements StudentService{
    @Autowired
    StudentRepo StudentRepo;

    @Override
   public Student insertStudent(Student st){
    return StudentRepo.save(st);
   }
   @Override
   public List<Student> getAllstudent(){
    return studentRepo.findAll();
    }

    @Override
    public Optional<Student> getOneStudent(Long id) {
        return studentRepo.findById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}