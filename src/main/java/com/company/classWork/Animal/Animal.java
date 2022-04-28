package com.company.classWork.Animal;


    public class Animal {
        public String name;
        public int age;
        public int weight;
        private int legsNumber;


        public void sayHello() {
            System.out.println("Hi, I`m animal. My name is " + this.name + "I`m" + this.age + "years old" + "my weight is " + this.weight);
        }

        public Animal(String name, int age, int weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
        }


        public Animal( int age, int weight) {
            this.age = age;
            this.name = "poka net";
            this.weight = weight;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
        public void increaseAge(int age){
            age ++;
        }
    }

