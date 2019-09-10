package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
        String line;
        int count = 0;
        while((line = reader.readLine()) != null) {
            String[]array = line.split(" ");
            for(String s : words) {
                for (String s2 : array) {
                    if (s.equals(s2))
                        count++;
                }
            }
            if (count==2) {
                System.out.println(line);
            }
            count=0;
        }
        br.close();
        reader.close();
    }
}
