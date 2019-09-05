package com.in28minutes.database.databasedemo.jpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.database.databasedemo.SpringJpaDemoApplication;
import com.in28minutes.database.databasedemo.entity.Person;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringJpaDemoApplication.class)
public class PersonJpaRepositoryTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	
	@Test
	public void findByIdTest() {
		Person person = repository.findById(10003);
		logger.info("Person is--> {}",person);
		assertEquals("Nisarg3", person.getName());
		
	}
	
	@Test
	@DirtiesContext
	public void deleteByid() {
		repository.deleteById(10003);
		assertNull(repository.findById(10003));
	}
	
	@Test
	@DirtiesContext
	public void playWithEntity() {
		repository.playWithEntityManager();
	}
	

}
