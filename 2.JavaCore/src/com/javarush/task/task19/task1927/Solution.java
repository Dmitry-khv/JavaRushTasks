package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws FileNotFoundException {
        String context = "JavaRush - курсы Java онлайн";
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String[]result = outputStream.toString().split("\n");
        System.setOut(console);
//        for (String s : result)
//            System.out.println(s);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            if ((i+1)%2==0)
                System.out.println(context);
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
