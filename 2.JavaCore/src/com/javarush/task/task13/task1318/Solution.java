package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file = bf.readLine();
        FileInputStream is = new FileInputStream(file);
        BufferedReader in = new BufferedReader(new InputStreamReader(is));


        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        bf.close();
        is.close();
        in.close();
    }
}