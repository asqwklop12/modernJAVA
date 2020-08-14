package chapter09;

import chapter05.streams.Type;

public class Dish {
    private int calories;
    private boolean vegetarian;
    private String name;
    private Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.name = name;
        this.type = type;
    }

    CaloricLevel getCaloricLevel() {
        if (this.getCalories() <= 400) return CaloricLevel.DIET;
        else if (this.getCalories() <= 700) return CaloricLevel.NORMAL;
        return CaloricLevel.FAT;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return name;
    }
}
