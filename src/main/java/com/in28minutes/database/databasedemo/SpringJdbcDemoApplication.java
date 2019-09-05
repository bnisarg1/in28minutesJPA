package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("All Userse -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("User id 10002 -> {}", dao.findById(10002));
		logger.info("User id 10003 -> {}", dao.findById(10003));

		// Delete
		logger.info("Delete user id 10001 -> {}", dao.deleteById(10003));
		// Insert

		logger.info("Delete user id 10001 -> {}", dao.insert(new Person(10004, "Nisarg4", "Banglore4", new Date())));

		// update
		logger.info("Updae user id 1004 -> {}", dao.update(new Person(10001, "Nisarg5", "Banglore4", new Date())));
		// TODO Auto-generated method stub

	}

}
