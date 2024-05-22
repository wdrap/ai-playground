package dev.wid.mother;

import java.util.function.Consumer;

import dev.wid.domain.Address;
import dev.wid.domain.Person;


public class PersonMother {
    
    public static Person.PersonBuilder createPerson(Consumer<Address.AddressBuilder> addressConsumer) {
        Address.AddressBuilder addressBuilder = AddressMother.createAddress();
        addressConsumer.accept(addressBuilder);
     
        return Person.builder()
            .name("John Doe")
            .age(30)
            .address(addressBuilder.build());
    }

       
    public static Person.PersonBuilder createPerson() {
        return createPerson(addressBuilder -> {});
    }
}