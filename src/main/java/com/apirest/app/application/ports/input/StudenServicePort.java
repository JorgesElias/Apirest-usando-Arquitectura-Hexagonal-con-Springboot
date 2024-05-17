package com.apirest.app.application.ports.input;



import com.apirest.app.domain.model.Student;

import java.util.List;;

public interface StudenServicePort {

Student findByid(Long id);

List <Student> findAll();

Student save(Student student);

Student update(Long id, Student student);

void deleteByid(Long id);

}
