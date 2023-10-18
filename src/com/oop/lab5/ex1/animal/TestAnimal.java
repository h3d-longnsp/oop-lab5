package com.oop.lab5.ex1.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("joe");
        System.out.println(animal1);

        Mammal mammal1 = new Mammal("john");
        System.out.println(mammal1);

        Cat cat1 = new Cat("Tom");
        System.out.println(cat1);
        cat1.greets();

        Dog dog1 = new Dog("Butch");
        System.out.println(dog1);
        dog1.greets();

        Dog dog2 = new Dog("Ki");
        dog2.greets(dog1);
    }
}
