package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));


        switch (args[0]) {
            case ("-u"): {
                while (line != null) {
                    StringBuilder sb = new StringBuilder();
                    int fileId = Integer.parseInt(line.substring(0, 8).trim());
                    int id = Integer.parseInt(args[1].trim());
                    if (fileId == id) {
                        String arg1 = String.format("%1$-8s", id);
                        String arg2 = String.format("%1$-30s", args[2]);
                        String arg3 = String.format("%1$-8s", args[3]);
                        String arg4 = String.format("%1$-4s", args[4]);
                        line = (sb.append(arg1).append(arg2).append(arg3).append(arg4)).toString();
                    } else line = (sb.append(line)).toString();
                    writer.write(line);
                    line = reader.readLine();
                    if (line != null) writer.write("\n");
                }
                break;
            }
            case ("-d"): {
                ArrayList<String> list = new ArrayList<>();
                while (line != null) {
                    list.add(line);
                    line = reader.readLine();
                }
                for (int i = 0; i < list.size(); ) {
                    int fileId = Integer.parseInt(list.get(i).substring(0, 8).trim());
                    int id = Integer.parseInt(args[1].trim());
                    if (fileId == id) list.remove(i);
                    else i++;
                }
                for (int i = 0; i < list.size(); i++) {
                    writer.write(list.get(i));
                    if (i < list.size()-1) writer.write("\n");
                }
                break;
            }
        }
        writer.close();
        reader.close();
    }
}
