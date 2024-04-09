package dev.wdrap.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPersonConstructor() {
        Address address = new Address("123 Main St", "City", "State", "12345");
        Person person = new Person("John Doe", 30, address);

        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
        assertEquals(address, person.getAddress());
    }

    @Test
    public void testPersonGettersAndSetters() {
        Address address = new Address("123 Main St", "City", "State", "12345");
        Person person = new Person();

        person.setName("John Doe");
        person.setAge(30);
        person.setAddress(address);

        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
        assertEquals(address, person.getAddress());
    }
}