package ru.geekbrains.lesson7;

import org.junit.Test;

public class GeekUnitExceptionTest {

    @Test(expected = RuntimeException.class)
    public void test1() {
        GeekUnit.start(GeekTestExcClass.class);
    }

    @Test(expected = RuntimeException.class)
    public void test2() {
        GeekUnit.start(GeekTestExcClass2.class);
    }

    @Test(expected = RuntimeException.class)
    public void test3() {
        GeekUnit.start(GeekTestExcClass3.class);
    }

    @Test(expected = RuntimeException.class)
    public void test4() {
        GeekUnit.start(GeekTestExcClass4.class);
    }

    @Test(expected = RuntimeException.class)
    public void test5() {
        GeekUnit.start(GeekTestExcClass5.class);
    }
}
