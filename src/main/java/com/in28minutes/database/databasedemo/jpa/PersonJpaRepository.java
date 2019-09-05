package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery= entityManager.createNamedQuery("find_all_person",Person.class);
		return namedQuery.getResultList();
		
	}	

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public void deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}
	
	public void playWithEntityManager() {
		
		Person person=  new Person();
		logger.debug("Playing With Entity Manager");
		person.setName("Nisarg49");
		
		entityManager.persist(person);
		entityManager.flush();
		//entityManager.detach(person);
		entityManager.clear();
		//entityManager.refresh(person);
		person.setName("Nisarg94");
		
		
		logger.debug("Playing With Entity Manager");
	}
	
}
