package ru.geekbrains.lesson1.fruits;

public abstract class Fruit {
    float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
