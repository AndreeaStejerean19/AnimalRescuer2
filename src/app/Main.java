package app;

import entities.adopters.Father;
import entities.adopters.Girl;

public class Main {
    public static void main(String[] args) {

        Girl girl = new Girl();
        girl.setAge(7);
        girl.setHairColor("red");
        
        System.out.println("The girl is "+  girl.getAge() + " years old");
        System.out.println("The hair's color of the girl is " + girl.getHairColor());
        System.out.println(girl.petLover);

        Father father = new Father();
        System.out.println("The father is " + father.getHeight() );


    }
}