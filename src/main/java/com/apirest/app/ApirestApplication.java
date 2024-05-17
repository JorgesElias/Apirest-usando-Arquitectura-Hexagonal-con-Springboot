package com.apirest.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apirest.app.infrastructure.adapters.output.persistence.entity.StudentEntity;
import com.apirest.app.infrastructure.adapters.output.persistence.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication

public class ApirestApplication implements CommandLineRunner {
	private final StudentRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
		
	

	}

	@Override
	public void run(String... args) throws Exception {
		List<StudentEntity> entities = Arrays.asList(
				new StudentEntity(null, "Juan", "Mendoza", 28, "Calle 1"),
				new StudentEntity(null, "Carlos", "Rodriguez", 30, "Calle 2"),
				new StudentEntity(null, "Julio", "Perez", 10, "Calle 3"),
				new StudentEntity(null, "Roman", "Ramirez", 40, "Calle 4")
		);
		repository.saveAll(entities);
	
	
	}

	
}
