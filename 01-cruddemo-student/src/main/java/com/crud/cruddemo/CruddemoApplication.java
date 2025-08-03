package com.crud.cruddemo;

import com.crud.cruddemo.DAO.StudentDao;
import com.crud.cruddemo.DAO.StudentDaoIMPL;
import com.crud.cruddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CruddemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	// Interface fonctionnelle dont lambda retourne un objet de cette interface grace
	// a une classe anonyme qui implémente ça méthode en utilisant lambda
	// CommandLineRunner s'execute directement après le lancement de l'application
	// et s'execute sans avoir besoin de l'injecter nulle part
	@Bean
	public CommandLineRunner commandlinerunner(StudentDao studentDao) {

		return running ->{
			//System.out.println("Hello World");
			Student student = new Student("Adnane","Rafai","rafaiadnane9@gmail.com");
			studentDao.save(student);
		};

	}


}
