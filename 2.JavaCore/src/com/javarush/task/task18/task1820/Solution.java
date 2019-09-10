package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileName = new BufferedReader(new InputStreamReader(new FileInputStream(bufferedReader.readLine())));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(bufferedReader.readLine())));

        String line = fileName.readLine();
        String[] strarr = line.split(" ");
        String s = "";

        for (int i = 0; i < strarr.length; i++) {
            double tmp = Double.parseDouble(strarr[i]);
            int t = (int)Math.round(tmp);
            s += t + " ";
        }
        s = s.trim();
        writer.write(s,0,s.length());
        bufferedReader.close();
        fileName.close();
        writer.close();

    }
}
