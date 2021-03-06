package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonJpaRepository dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dao.playWithEntityManager();

		/*
		 * logger.info("All Userse -> {}", dao.findAll());
		 * logger.info("User id 10001 -> {}", dao.findById(10001));
		 * logger.info("User id 10002 -> {}", dao.findById(10002));
		 * logger.info("User id 10003 -> {}", dao.findById(10003));
		 * 
		 * 
		 * // Delete //logger.info("Delete user id 10001 -> {}", dao.deleteById(10003));
		 * dao.deleteById(10003); // Insert
		 * 
		 * logger.info("insert user id 10004 -> {}", dao.insert(new Person(10004,
		 * "Nisarg4", "Banglore4", new Date())));
		 * logger.info("insert user id 10004 -> {}", dao.insert(new Person(10005,
		 * "Nisarg4", "Banglore4", new Date()))); // update
		 * logger.info("Updae user id 1004 -> {}", dao.update(new Person(10001,
		 * "Nisarg5", "Banglore5", new Date()))); // TODO Auto-generated method stub
		 */
		
	}

}
