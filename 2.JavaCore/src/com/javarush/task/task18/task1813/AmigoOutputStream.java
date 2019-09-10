package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:\\Users\\Дмитрий\\Desktop\\File1.txt";
    private FileOutputStream file;

    public AmigoOutputStream(FileOutputStream file) throws FileNotFoundException {
        super(fileName);
        this.file = file;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));

    }


    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        file.write(b, off, len);
    }

    @Override
    public void write(int b) throws IOException {
        file.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        file.write(b);
    }

    @Override
    public void close() throws IOException {
        file.flush();
        String data = "JavaRush © All rights reserved.";
        file.write(data.getBytes());
        file.close();

    }

    @Override
    public void flush() throws IOException {
        file.flush();

    }
}
