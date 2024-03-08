package net.javaprojects.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaprojects.sms.entity.Student;
import net.javaprojects.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("John", "Smith", "john.smith@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Brat", "Pitt", "brat.pitt@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Leonardo", "DiCaprio", "leonardo.dicaprio@gmail.com");
//		studentRepository.save(student3);
	}

}
