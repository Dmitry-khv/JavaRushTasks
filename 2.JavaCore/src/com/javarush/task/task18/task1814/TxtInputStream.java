package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    private String fileName;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (fileName.endsWith(".txt"))
            this.fileName = fileName;
        else {
            this.close();
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        new TxtInputStream("C:\\Users\\Дмитрий\\Desktop\\File1.txt.exe");
    }
}


