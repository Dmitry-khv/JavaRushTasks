package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream is = new FileInputStream(br.readLine());
        BufferedReader bfOut = new BufferedReader(new InputStreamReader(is));
        ArrayList<Integer>arr = new ArrayList<>();
        String line;

        while((line = bfOut.readLine()) != null) {
            try {
                int i = Integer.parseInt(line);
                arr.add(i);
            } catch (NumberFormatException e) {
                int[] num = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
                for(int i : num) arr.add(i);
            }
        }

        Collections.sort(arr);
        for(int i : arr) {
            if (i%2==0)
            System.out.println(i);
        }

        br.close();
        is.close();
        bfOut.close();
    }
}
