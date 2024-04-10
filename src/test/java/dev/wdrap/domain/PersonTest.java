
package dev.wdrap.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dev.wdrap.domain.Person;
import dev.wdrap.domain.Address;
import dev.wdrap.domain.mother.PersonMother;

public class PersonTest {

    @Test
    public void testPersonConstructor() {
        Person person = PersonMother
                .createPerson(addressConsumer -> addressConsumer.street("1 Main St"))
                .build();

        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
        assertEquals("1 Main St", person.getAddress().getStreet());
        assertEquals("City", person.getAddress().getCity());
        assertEquals("State", person.getAddress().getCountry());
        assertEquals("12345", person.getAddress().getPostalCode());
    }

}