package com.naresh.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.naresh.model.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {
	
	private static final Logger log=LoggerFactory.getLogger(PersonItemProcessor.class);

	@Override
	public Person process(Person person) throws Exception {
		final String firstName=person.getLastName().toUpperCase();
		final String lastName=person.getFirstName().toUpperCase();
		final Person transformedPerson=new Person(firstName,lastName);
		log.info(person.toString()+"tran"+transformedPerson.toString());
	    return transformedPerson;
	}
	
	

}
