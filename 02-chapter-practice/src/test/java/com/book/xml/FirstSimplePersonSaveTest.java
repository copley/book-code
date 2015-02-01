package com.book.xml;

import com.book.base.Person;
import com.book.base.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Description: Test class exemplifying how to save a person with Spring using an XML configuration.
 * The environment is bootstrapped using a ClassPathXmlApplicationContext instance.
 * The beans used here are POJO instances from package com.book.plain
 */
public class FirstSimplePersonSaveTest {

    @Test
    public void savePersonOne() {
        // Create the application from the configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/app-simple-config.xml");
        // Look up the application service interface
        PersonService service = null;
        //TODO 3. Request the "personService" bean from the context and store it into the service variable
        // Use the service
        Person person = new Person("John", "Smith", "1980-04-03");
        int result = service.save(person);
        assertEquals(1, result);
    }

}