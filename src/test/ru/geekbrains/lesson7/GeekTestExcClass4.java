package ru.geekbrains.lesson7;

public class GeekTestExcClass4 {
    @Test
    public static void test6() {
        System.out.println("test 6");
    }

    @Test(priority = 11)
    public static void test7() {
        System.out.println("test 7");
    }

    public static void notAnnotatedTes() {
        System.out.println("Not to be printed");
    }

    @AfterSuit
    public static void afterSuit() {
        System.out.println("after suit");
    }
}
