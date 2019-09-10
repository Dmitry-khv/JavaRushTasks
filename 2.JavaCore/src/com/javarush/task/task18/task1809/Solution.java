package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(bf.readLine());
        FileOutputStream fos = new FileOutputStream(bf.readLine());

        int count = 0;

        byte [] buffer = new byte[fis.available()];
        while (fis.available()>0) {
            count = fis.read(buffer);
        }
        for (int i = 0; i < buffer.length/2; i++) {
            byte temp = buffer[i];
            buffer[i] = buffer[buffer.length - i - 1];
            buffer[buffer.length - i - 1] = temp;
        }
        fos.write(buffer, 0, count);
        bf.close();
        fis.close();
        fos.close();
    }
}
