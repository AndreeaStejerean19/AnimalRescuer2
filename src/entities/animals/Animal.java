package entities.animals;

public class Animal {
    private String name;
    private int age;
    private int happinessLvl;
    private enum Weight {
        UNDERWEIGHT,
        NORMAL,
        OVERWEIGHT
    }
    private boolean isHungry;
}
