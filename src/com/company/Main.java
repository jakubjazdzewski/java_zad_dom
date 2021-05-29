package com.company;

class Car
{
    final String model;
    final String producer;

    private int year =2019;
    private Double weight=1500.50;

    Car(String model, String producer)
    {
        this.model = model;
        this.producer = producer;


    }
}

class Animal
{
    final String species;
    private Double weight;

    Animal(String species) {
        this.species = species;
        this.weight = weight;
        if(species == "Pies")
        {
            weight = 10.0;
        }else if(species == "Kot")
        {
            weight = 5.0;
        }
    }

    void feed()
    {
        if(weight>0) {
            weight++;
            System.out.println("Waga Twojego zwierzaka "+species+" : " + weight);
        }
        else
        {
            System.out.println("Zabiles go!");
        }

    }

    void takeForAWalk()
    {
        weight--;
        if(weight<4 && weight>0) {
            System.out.println("Twoj zwierzak: "+species+"jest glodny, nakarm go!");
            System.out.println("Waga Twojego zwierzaka: "+species+" : " + weight);
        }
        else if(weight == 0) {
            System.out.println("Twoj: "+species+" umarl");
        }
        else if(weight <0)
            System.out.println("Zabiles go!");
        else
        {
            System.out.println("Waga Twojego zwierzaka: "+species+" : " + weight);
        }
    }
}

class Human
{
    Human (Animal pet, Car car)
    {
    }

}

class Phone
{

}

public class Main {

    public static void main(String[] args) {
        Animal zwierze = new Animal("Pies");
        Animal zwierze2 = new Animal("Kot");

        Car samochod = new Car("Malaga","Seat");
        Human czlowiek = new Human(zwierze, samochod);

        zwierze.feed();
        for(int i=0;i<10;i++)
            zwierze.takeForAWalk();
        zwierze.takeForAWalk();
        zwierze.takeForAWalk();
        zwierze.feed();

        zwierze2.takeForAWalk();
        zwierze2.takeForAWalk();
        zwierze2.takeForAWalk();
        zwierze2.takeForAWalk();
        zwierze2.takeForAWalk();
        zwierze2.feed();
        zwierze2.feed();
        zwierze2.takeForAWalk();
        zwierze2.takeForAWalk();
        zwierze2.feed();
    }
}
