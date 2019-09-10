package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos;
        FileInputStream fis;
        TreeSet <String> list = new TreeSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String result = line.substring(0, line.lastIndexOf('.'));
        fos = new FileOutputStream(result);

        while (!line.equals("end")) {
            list.add(line);
            line = br.readLine();
        }
        for (String filePart : list) {
            fis = new FileInputStream(filePart);
            byte[]buffer = new byte[fis.available()];
            fis.read(buffer);
            fos.write(buffer);
            fis.close();
        }
        fos.close();
        br.close();
    }
}
