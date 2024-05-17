package com.apirest.app.infrastructure.adapters.input.rest.mapper;

import com.apirest.app.domain.model.Student;
import com.apirest.app.infrastructure.adapters.input.rest.model.request.StudentCreateRequest;
import com.apirest.app.infrastructure.adapters.input.rest.model.response.StudentResponse;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentRestMapper {
 Student toStudent(StudentCreateRequest request);

  StudentResponse toStudentResponse(Student student);

  List<StudentResponse> toStudentResponseList(List<Student> studentList);
}
