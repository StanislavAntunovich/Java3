package ru.geekbrains.lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GeekUnit {
    public static void start(Class clazz) {
        List<Method> methods = new ArrayList<>();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Method beforeSuit = null;
        Method afterSuit = null;

        for (Method m : declaredMethods) {
            if (m.isAnnotationPresent(Test.class)) {
                if (m.getAnnotation(Test.class).priority() < 1 || m.getAnnotation(Test.class).priority() > 10) {
                    throw new RuntimeException(
                            String.format("Priority must be not less than 1 or more than 10. In method %s got %d",
                                    m.getName(), m.getAnnotation(Test.class).priority()));
                }
                methods.add(m);
            } else if (m.isAnnotationPresent(BeforeSuit.class)) {
                if (beforeSuit == null) {
                    beforeSuit = m;
                } else {
                    throw new RuntimeException("More than one BeforeSuit annotation");
                }
            } else if (m.isAnnotationPresent(AfterSuit.class)) {
                if (afterSuit == null) {
                    afterSuit = m;
                } else {
                    throw new RuntimeException("More than one AfterSuit annotation");
                }
            }
        }

        methods.sort((Method m1, Method m2) ->
                m2.getAnnotation(Test.class).priority() - m1.getAnnotation(Test.class).priority());

        if (beforeSuit != null) {
            methods.add(0, beforeSuit);
        }

        if (afterSuit != null) {
            methods.add(afterSuit);
        } else {
            // По заданию не понятно - нужно ли это,
            // там явно можно понять только что может отсутствовать аннотация BeforeSuit
            throw new RuntimeException("No After Suit Annotation found");
        }

        for (Method m : methods) {
            try {
                m.invoke(null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

    }

    public static void start(String className) throws ClassNotFoundException {
        Class cl = Class.forName(className);
        start(cl);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        start(GeekTestClass.class);
        System.out.println("--------------------");
        start("ru.geekbrains.lesson7.GeekTestClass");
    }

}
