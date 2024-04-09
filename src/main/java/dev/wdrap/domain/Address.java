package dev.wdrap.domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@Builder
public class Address {
    private final String street;
    private final String city;
    private final String country;
    private final String postalCode;
}