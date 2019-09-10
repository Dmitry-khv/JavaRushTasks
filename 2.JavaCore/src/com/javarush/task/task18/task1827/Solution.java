package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            File fileName = new File((new BufferedReader(new InputStreamReader(System.in))).readLine());
            FileInputStream fis = new FileInputStream(fileName);
            BufferedReader is = new BufferedReader(new InputStreamReader(fis));

            int max = 0;
            String line;
            while ((line = is.readLine()) != null) {
                line = line.substring(0, 8);
                int tmp = Integer.parseInt(line.trim());
                if (max < tmp) max = tmp;
            }
            max++;

            String line1 = String.format("%1$-8s", max);
            String line2 = String.format("%1$-30s", args[1]);
            String line3 = String.format("%1$-8s", args[2]);
            String line4 = String.format("%1$-4s", args[3]);

            StringBuilder builder = new StringBuilder(50);
            builder.append("\n").append(line1).append(line2).append(line3).append(line4);

//        FileOutputStream fos = new FileOutputStream(fileName, true);
//        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(fos));
//        wr.write(builder.toString());

            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(builder.toString());
            fis.close();
            bw.close();
//        fos.close();
        }
    }
}
