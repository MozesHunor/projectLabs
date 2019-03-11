package org.fasttrackit.catel;

public class Catel {
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void bark() {
        System.out.println("Ham");
    }

    public void eat() {
        weight++;

        if (weight >= 10) {
            age++;
        }
    }


}
