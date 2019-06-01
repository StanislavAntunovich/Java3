package ru.geekbrains.lesson7;

public class GeekTestClass {

    @Test(priority = 1)
    public static void test1() {
        System.out.println("test 1");
    }

    @Test(priority = 10)
    public static void test2() {
        System.out.println("test 2");
    }

    @Test(priority = 2)
    public static void test3() {
        System.out.println("test 3");
    }

    @Test
    public static void test4() {
        System.out.println("test 4");
    }

    @Test(priority = 6)
    public static void test5() {
        System.out.println("test 5");
    }

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

    @AfterSuit
    public static void afterSuit() {
        System.out.println("after suit");
    }

    @BeforeSuit
    public static void beforeSuit() {
        System.out.println("before suit");
    }

}
