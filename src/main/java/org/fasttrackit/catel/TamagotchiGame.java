package org.fasttrackit.catel;

public class TamagotchiGame {

    public static void main(String[] args) {

        Catel dog1 = new Catel();
        dog1.setName("Rex");

        Catel dog2 = new Catel();
        dog2.setName("Iisus");

        for (int i = 0; i < 15; i++) {
            dog2.eat();
        }

        System.out.println(dog2.getName() + "'s age is: " + dog2.getAge());
    }
}
