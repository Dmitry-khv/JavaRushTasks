package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //add your code here - добавьте код тут
    //public static ReadFileThread readFileThread = new ReadFileThread();

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();

        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);
        void start();
        String getFileContent();

        void join() throws InterruptedException;


    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
//        private String fileName = "";
        String data = "";
        String result = "";
        File file;

        @Override
        public void setFileName(String fullFileName) {
            file = new File (fullFileName);
        }

        @Override
        public String getFileContent() {
            return toString();
        }

        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while ((data = reader.readLine()) != null) {
                    result = result + data + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            result = result.trim();
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return result;
        }
    }
}
