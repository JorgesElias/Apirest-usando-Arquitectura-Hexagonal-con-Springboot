package com.apirest.app.application.ports.output;

import java.util.Optional;
import java.util.List;
import com.apirest.app.domain.model.Student;

public interface StudenPersistencePort {
    
  Optional<Student> findById(Long id);
  List<Student> findAll();
  Student save(Student student);
  void deleteById(Long id);


}
