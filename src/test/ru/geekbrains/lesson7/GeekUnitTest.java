package ru.geekbrains.lesson7;

import org.junit.Test;

public class GeekUnitTest {

    @Test(expected = RuntimeException.class)
    public void test1() {
        GeekUnit.start(GeekTestExcClass.class);
    }

    @Test(expected = RuntimeException.class)
    public void test2() {
        GeekUnit.start(GeekTestExcClass2.class);
    }
}
