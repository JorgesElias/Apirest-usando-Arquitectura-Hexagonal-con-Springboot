package com.apirest.app.infrastructure.adapters.output.persistence.mapper;

import org.mapstruct.Mapper;
import java.util.List;
import com.apirest.app.domain.model.Student;
import com.apirest.app.infrastructure.adapters.output.persistence.entity.StudentEntity;

@Mapper(componentModel = "spring")
public interface StudentPersistenceMapper {
  StudentEntity toStudentEntity(Student student);

  Student toStudent(StudentEntity entity);

  List<Student> toStudentList(List<StudentEntity> entityList);


}
