package com.company.classWork.Animal;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, int weight, String breed) {
        super(name, age, weight);

        this.breed=breed;
    }
}