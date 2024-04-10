package dev.wdrap.domain.mother;

import dev.wdrap.domain.Person;
import dev.wdrap.domain.Address;
import java.util.function.Consumer;


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