package dev.wdrap.domain.mother;

import dev.wdrap.domain.Address;

public class AddressMother {
    public static Address.AddressBuilder createAddress() {
        return Address.builder()
            .street("123 Main St")
            .city("City")
            .country("State")
            .postalCode("12345");
    }
}