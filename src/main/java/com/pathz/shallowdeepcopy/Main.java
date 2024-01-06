package com.pathz.shallowdeepcopy;

import lombok.Builder;
import lombok.Data;

@Data
class Person implements Cloneable {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.address = (Address) address.clone();
        return clonedPerson;
    }
}

@Data
class Address implements Cloneable {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");

        Person originalPerson = new Person("John", address);

//        // Глибока копія
//        Person deepCopyPerson = (Person) originalPerson.clone();

        // Неглибока копія
        Person shallowCopyPerson = new Person(originalPerson.getName(), originalPerson.getAddress());

        // Тепер змінимо адресу в оригінальному об'єкті
        originalPerson.getAddress().setCity("Los Angeles");

//        System.out.println("Глибока копія: " + deepCopyPerson.getAddress().getCity()); // Виведе "New York"
        System.out.println("Неглибока копія: " + shallowCopyPerson.getAddress().getCity()); // Виведе "Los Angeles"
        System.out.println("Оригінал: " + originalPerson.getAddress().getCity()); // Виведе "Los Angeles"
    }
}

