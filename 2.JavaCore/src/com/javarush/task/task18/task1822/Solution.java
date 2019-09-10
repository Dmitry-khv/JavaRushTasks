package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(bf.readLine())));
        String s;
        while ((s = reader.readLine()) != null) {
            String[]line = s.split(" ");
            if (line[0].equals(args[0])) System.out.println(s);
        }
        bf.close();
        reader.close();
    }
}
