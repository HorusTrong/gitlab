package com.itcgroup.Demo_1.student;


import java.time.LocalDate;
import java.util.List;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args ->{
					Student horus = new Student("Horus","horus.t@itcgroup.io",LocalDate.of(2000, 3, 2));
					Student trong = new Student("Trong","trong@itcgroup.io",LocalDate.of(2003, 3, 6));
					repository.saveAll(List.of(horus,trong));
		};
	}
}
