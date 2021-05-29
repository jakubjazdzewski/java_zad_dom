package com.company;

class Car
{
    final String model;
    final String producer;

    private int year =2019;
    private Double weight=1500.50;

    final Double value;

    Car(String model, String producer, Double value)
    {
        this.model = model;
        this.producer = producer;
        this.value = value;


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
    private Double salary =2000.0;
    private Double salary_before = salary;

    public Double getNumber() {
        System.out.println("Wyplata przed: "+salary_before);
        salary_before = salary;
        System.out.println("Wyplata po: "+salary);
        return this.salary;
    }

    public void setNumber(Double num) {
        if(num>0)
        {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Musisz odebrać aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US zostaly poinformowane o zmianie wypłaty! \nNie ma sensu, abys ukrywal dochod");
            this.salary = num;
        }
    }

    private Car carVariable;

    Human (Animal pet, Car carVariable)
    {
        this.carVariable = carVariable;
    }

    public Car getCar()
    {
        return this.carVariable;
    }

    public void setCar(Car carVariable)
    {
        if(salary>this.carVariable.value)
        {
            System.out.println("Udalo sie kupic samochod");
            this.carVariable = carVariable;
        }
        else if (salary>(carVariable.value/12.0))
        {
            System.out.println("udało się kupić na kredyt (no trudno)");
            this.carVariable = carVariable;
        }
        else
        {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

}

class Phone
{

}

public class Main {

    public static void main(String[] args) {
        Animal zwierze = new Animal("Pies");
        Animal zwierze2 = new Animal("Kot");

        Car samochod = new Car("Malaga","Seat", 2700.49);
        Human czlowiek = new Human(zwierze, samochod);

        /*
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

         */
        czlowiek.setNumber(2100.0);
        Double number = czlowiek.getNumber();
        czlowiek.setNumber(-2200.0);
        Double number2 = czlowiek.getNumber();
        czlowiek.setNumber(2500.0);
        Double number3 = czlowiek.getNumber();
    }
}
