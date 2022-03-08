package ru.netology;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        for (int i = 0; i < 4; i++) {
            Thread thread = (new MyThread());
            thread.setName("Поток " + i);
            thread = new Thread(mainGroup, thread);
            thread.start();
        }
        Thread.sleep(15000);
        mainGroup.interrupt();
    }
}
