package com.company.classWork.Animal;



public class Animal_itd {
    public static void main(String[] args) {


        Animal Afrodita = new Animal("Afrodita", 1, 10);
        Animal Hermes = new Animal("Hermes", 10, 100);
        Afrodita.sayHello();
        Hermes.sayHello();
        System.out.println(Afrodita.getName());
        Afrodita.setName("pochti Hermes");
        System.out.println(Afrodita.getName());

        Dog dog = new Dog("Bobik", 4, 17, "shepherd");


    }
}