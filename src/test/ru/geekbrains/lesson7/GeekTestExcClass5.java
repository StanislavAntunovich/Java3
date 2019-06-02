package ru.geekbrains.lesson7;

public class GeekTestExcClass5 {
    @Test
    public static void test6() {
        System.out.println("test 6");
    }

    @Test
    public static void test7() {
        System.out.println("test 7");
    }

    public static void notAnnotatedTes() {
        System.out.println("Not to be printed");
    }

    @BeforeSuit
    public static void beforeSuit() {
        System.out.println("before suit");
    }
}
