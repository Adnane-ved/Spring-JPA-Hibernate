package com.contacts.contacts;

import com.contacts.contacts.dao.ContactsDao;
import com.contacts.contacts.dao.ContactsDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ContactsApplication {

	// 1st solution
	@Autowired
	ContactsDao contactsDao;
	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

	@Bean // in bean methods ne ver put @Autowired it confuses spring
	      // spring will the injection alone
	public CommandLineRunner commandlinerunner(/*2sd solution: ContactsDaoImpl contactsDao; without @Autowired*/) {
		return running -> {
			Contacts contact = new Contacts("b","fdzf","ddf","sfdfvdfb");
            contactsDao.save(contact);
		};
	}

}
