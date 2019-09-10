package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream(args[0]);
        int[] buffer = new int[256];
        while (stream.available() > 0) {
            buffer[stream.read()]++;
        }

        for (int i = 0; i < buffer.length; ) {
            if (buffer[i] == 0) i++;
            else {
                System.out.println((char) i + " " + buffer[i]);
                i++;
            }
        }
        stream.close();
    }
}
