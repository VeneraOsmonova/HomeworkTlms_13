package com.company;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Clown fish");
        fish.setKingdom("Animals");
        fish.setType("Chordates");
        fish.setClassF("Ray-finned fish");
        fish.setColor("From deep purple to fiery orange, red and yellow");
        System.out.println(fish.getName());
        System.out.println(fish.getKingdom());
        System.out.println(fish.getType());
        System.out.println(fish.getClassF());
        System.out.println(fish.getColor());
        System.out.println("______________________________");


        Parrot parrot = new Parrot();
        parrot.setName("Gosha");
        parrot.setAge(4);
        parrot.setBreed("Budgie");
        parrot.setColor("light green");
        System.out.println(parrot.getName());
        System.out.println(parrot.getAge());
        System.out.println(parrot.getBreed());
        System.out.println(parrot.getColor());
        System.out.println("______________________________");


        Cat cat = new Cat();
        cat.setName("Murzik");
        cat.setAge(8);
        cat.setBreed("Maine Coon");
        cat.setColor("grey");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getBreed());
        System.out.println(cat.getColor());
        System.out.println("______________________________");


        Dog dog = new Dog();
        dog.setName("Kabylan");
        dog.setAge(12);
        dog.setBreed("German Shepherd");
        dog.setColor("dark brown");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getBreed());
        System.out.println(dog.getColor());
        System.out.println("______________________________");




    }
}