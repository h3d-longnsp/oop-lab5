package com.oop.lab5.ex1.animal;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog anotherDog) {
        System.out.println("Woof woof");
    }

    @Override
    public String toString() {
        return String.format("Dog[%s]", super.toString());
    }
}
