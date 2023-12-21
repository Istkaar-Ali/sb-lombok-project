package com.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lombok.entities.Student;

@SpringBootApplication
public class Sb8LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb8LombokApplication.class, args);
		Student student = new Student();
		student.setAge(30);
		student.setName("This is my Lombok Project");
		student.setAddress("Roorkee");
		System.out.println(student.getAge());
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		
	}

}
