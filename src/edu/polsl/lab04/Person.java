package edu.polsl.lab04;

public class Person {

    private String firstname;
    private String lastname;

    private final int age;
    private Address address;

    public Person(String firstname, String lastname, int age, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
    }

    public Person(String firstname, String lastname, int age, String city, String street, String postalCode, int houseNumber) {
        this(firstname, lastname, age, new Address(city, street, postalCode, houseNumber));
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + ", " + age +
                "\n" + address;
    }

    public static void main(String[] args) {
        Address a1 = new Address("Katowice", "Pukowca", "40-100", 15);
        Person p1 = new Person("Jan", "Kowalski", 43, a1);
        Person p2 = new Person("Jan", "Kowal", 43, "Katowice", "Pukowca", "40-100", 15);
        System.out.println(p1);
        System.out.println(p2);
    }
}
