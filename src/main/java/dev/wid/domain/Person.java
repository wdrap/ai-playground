package dev.wid.domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@Builder
public class Person {
    private final String name;
    private final int age;
    private final Address address;
}