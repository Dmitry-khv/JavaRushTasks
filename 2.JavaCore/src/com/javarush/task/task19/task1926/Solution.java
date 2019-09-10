package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(br.readLine()));
        String line;
        while ((line = file.readLine()) != null) {
            System.out.println(new StringBuilder(line).reverse().toString());
        }
        br.close();
        file.close();
    }
}
