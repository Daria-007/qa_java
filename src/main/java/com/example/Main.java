package com.example;

public class Main {
    public static void main(String[] args) {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion("Самец", feline); // Передаем объект класса Feline
            System.out.println("Does lion have mane? " + lion.doesHaveMane());
            System.out.println("Number of kittens: " + lion.getKittens());
            System.out.println("Lion's food: " + lion.getFood());

            // Создаем экземпляр кота
            Cat cat = new Cat(feline);
            System.out.println("Cat's sound: " + cat.getSound());
            System.out.println("Cat's food: " + cat.getFood());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
