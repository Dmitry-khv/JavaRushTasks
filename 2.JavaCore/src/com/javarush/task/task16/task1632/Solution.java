package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        for (int i = 1; i < 6; i++) {
            threads.add(new TestThread(i));
        }
//        threads.add(new TestThread2());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            threads.get(i).start();
        }
    }

    public static class TestThread extends Thread implements Message {
        public static int result = 0;
        public TestThread(int id) {
            setName(String.valueOf(id));
        }

        @Override
        public void showWarning() {

        }

        @Override
        public void run() {
            if (Thread.currentThread().getName().equals(1)) while (true) {}
            if (Thread.currentThread().getName().equals(2)) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
            if (Thread.currentThread().getName().equals(3)) {
                while (true) {
                    System.out.println("Ура!");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (Thread.currentThread().getName().equals(4)) {
                showWarning();
            }
            if (Thread.currentThread().getName().equals(5)) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                    String string = reader.readLine();
                    if (string.equals("N")) {
                        System.out.println(result);
                        return;
                    }
                    int inNumber = Integer.parseInt(string);
                    result = result + inNumber;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

//    public static class TestThread2 extends Thread {
//        @Override
//        public void run() {
//
//        }
//    }
}