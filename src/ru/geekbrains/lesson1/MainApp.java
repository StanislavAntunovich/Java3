package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.fruits.Apple;
import ru.geekbrains.lesson1.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("before swapping: " + Arrays.toString(array));

        swap(array, 1, 5);

        System.out.println("after swapping: " + Arrays.toString(array));

        String[] strings = {"1", "2", "3"};
        List<String> convertedList = convert(strings);
        System.out.println("converted list is: " + convertedList.getClass().getName());

        Box<Apple> apples1 = new Box<>(
                new Apple(),
                new Apple(),
                new Apple()
        );

        Box<Orange> oranges1 = new Box<>(
                new Orange(),
                new Orange()

        );
        Box<Orange> oranges2 = new Box<>(
                new Orange(),
                new Orange()

        );
        Box<Orange> oranges3 = new Box<>(
                new Orange(),
                new Orange(),
                new Orange()

        );

        System.out.println();
        System.out.println("apples1 weight: " + apples1.getWeight());
        System.out.println("oranges1 weight: " + oranges1.getWeight());
        System.out.println("oranges3 weight: " + oranges3.getWeight());

        System.out.println();
        System.out.println("oranges1 same wight as oranges2: " + oranges1.compare(oranges2));
        System.out.println("oranges1 same wight as oranges3: " + oranges1.compare(oranges3));
        System.out.println("apples1 same wight as oranges1: " + apples1.compare(oranges1));
        System.out.println("apples1 same wight as oranges3: " + apples1.compare(oranges3));
        System.out.println();

        System.out.println("oranges1 before pouring: " + oranges1.getWeight());
        System.out.println("oranges2 before pouring: " + oranges2.getWeight());
        oranges1.pourIntoAnother(oranges2);
        System.out.println("oranges1 after pouring: " + oranges1.getWeight());
        System.out.println("oranges2 after pouring: " + oranges2.getWeight());
        System.out.println();

        System.out.println("oranges3 before pouring into itself: " + oranges3.getWeight());
        oranges3.pourIntoAnother(oranges3);
        System.out.println("oranges3 after pouring into itself: " + oranges3.getWeight());
        //oranges3.pourIntoAnother(apples1);
    }


    public static <T> ArrayList<T> convert(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    // на сколько я понял, если использовать здесь <T> компилятор все равно "приведет" его к Object
    // и смысла его использовать в данном случае особо нет
    public static void swap(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
