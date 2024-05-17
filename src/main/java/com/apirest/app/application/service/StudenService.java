package com.apirest.app.application.service;
import org.springframework.stereotype.Service;

import com.apirest.app.application.ports.input.StudenServicePort;
import com.apirest.app.application.ports.output.StudenPersistencePort;
import com.apirest.app.domain.exception.StudentNotFoundException;
import com.apirest.app.domain.model.Student;

import lombok.RequiredArgsConstructor;


import java.util.List;


@Service
@RequiredArgsConstructor
public class StudenService implements StudenServicePort {
    

    private final StudenPersistencePort persistencePort;

  @Override
  public Student findByid(Long id) {
    return persistencePort.findById(id)
        .orElseThrow(StudentNotFoundException::new);
  }

  @Override
  public List<Student> findAll() {
    return persistencePort.findAll();
  }

  @Override
  public Student save(Student student) {
    return persistencePort.save(student);
  }

  @Override
  public Student update(Long id, Student student) {
    return persistencePort.findById(id)
        .map(savedStudent -> {
          savedStudent.setFirstname(student.getFirstname());
          savedStudent.setLastname(student.getLastname());
          savedStudent.setAge(student.getAge());
          savedStudent.setAddress(student.getAddress());
          return persistencePort.save(savedStudent);
        })
        .orElseThrow(StudentNotFoundException::new);
  }

  @Override
  public void deleteByid(Long id) {
    if (persistencePort.findById(id).isEmpty()) {
      throw new StudentNotFoundException();
    }

    persistencePort.deleteById(id);
  }
}
