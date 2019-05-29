package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;


    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.size() == 0)
            return 0.0f;

        return fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box<? extends Fruit> another) {
        if (this == another)
            return true;
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void pourIntoAnother(Box<T> another) {
        if (this == another)
            return;
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
