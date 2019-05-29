package ru.geekbrains.lesson5;

import java.util.concurrent.Semaphore;

import static ru.geekbrains.lesson5.MainClass.CARS_COUNT;

public class Tunnel extends Stage {
    private Semaphore tunnelSmph;

    public Tunnel() {
        this.tunnelSmph = new Semaphore(CARS_COUNT / 2);
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                if (!tunnelSmph.tryAcquire()) {
                    System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                    tunnelSmph.acquire();
                }
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                tunnelSmph.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}