package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());
        if (one < 1 || two < 1) throw new Exception();

        if (one > two) System.out.println(NOD(one, two));
        else System.out.println(NOD(two, one));

    }

    public static int NOD(int a, int b) {
        if (a > b) {
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
        }
        return a;
    }
}
