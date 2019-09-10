package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(bf.readLine());
        FileOutputStream file2 = new FileOutputStream(bf.readLine());
        FileOutputStream file3 = new FileOutputStream(bf.readLine());

        byte[] buffer = new byte[file1.available()];

        if (file1.available() > 0) {
            int count = file1.read(buffer);
            file2.write(buffer, 0, count/2 + count % 2);
            file3.write(buffer, count/2 + count % 2, count/2);
        }

        bf.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
