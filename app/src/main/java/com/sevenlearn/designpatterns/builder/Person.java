package com.sevenlearn.designpatterns.builder;

/**
 * Created by user on 2/18/2018.
 */

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Person(){

    }

    public static class Builder {
        private int id;
        private String firstName;
        private String lastName;
        private int age;

        public Builder(int id) {
            this.id = id;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.firstName = firstName;
            person.lastName = lastName;
            person.age = age;
            person.id = id;
            return person;
        }
    }
}
