package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader file1 = new FileReader(br.readLine());
        FileWriter file2 = new FileWriter(br.readLine());
        while (file1.ready()) {
            char[]array = new char[7];
            file2.write(44);
        }
        br.close();
        file1.close();
        file2.close();
    }
}
