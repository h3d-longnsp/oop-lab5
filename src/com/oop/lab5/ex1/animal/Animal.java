package com.oop.lab5.ex1.animal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Animal[name = %s]", this.name);
    }
}
