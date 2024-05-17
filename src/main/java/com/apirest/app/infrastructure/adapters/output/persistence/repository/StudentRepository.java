package com.apirest.app.infrastructure.adapters.output.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.app.infrastructure.adapters.output.persistence.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}