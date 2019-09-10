package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        allLines = Files.readAllLines(Paths.get(br1.readLine()));
        forRemoveLines = Files.readAllLines(Paths.get(br1.readLine()));
        br1.close();

        Solution solution = new Solution();
        solution.joinData();
        System.out.println(allLines);
    }

    public void joinData() throws CorruptedDataException {
        for (String s : forRemoveLines) {
            if (allLines.contains(s)) allLines.remove(s);
            else {
                allLines.removeAll(allLines);
                throw new CorruptedDataException();
            }
        }
    }
}
