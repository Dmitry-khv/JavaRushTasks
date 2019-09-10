package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String in = bf.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(in));

        while (true) {
            in = bf.readLine();
            if (in.equals("exit")) break;

            bufferedWriter.write(in);
            bufferedWriter.write("\r\n");
        }
        bufferedWriter.write("exit");

        bf.close();
        bufferedWriter.close();
    }
}
