package com.pathz.polymorph;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private String city;
    private GoogleNavigator googleNavigator = new GoogleNavigator(this);

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
