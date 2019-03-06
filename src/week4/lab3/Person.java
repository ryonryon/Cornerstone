package week4.lab3;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * To define 'equals' for Person objects.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            // 1. comparing references
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            // 2. null checking & comparing class names
            return false;
        }
        // 3. comparing instance variables
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    /**
     * HashCode value for identify uniqueness of Person.
     * When using HashMap, HashSet, ...
     * You need to implement this method with .equals()
     * @return integer (hash value)
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}