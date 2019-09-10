package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    private static ImageReader imageReader;

    public static ImageReader getImageReader(ImageTypes data) {
//        try {
        if (data==ImageTypes.JPG) imageReader = new JpgReader();
        else if (data==ImageTypes.BMP) imageReader =  new BmpReader();
        else if (data==ImageTypes.PNG) imageReader =  new PngReader();
        else throw new IllegalArgumentException ("Неизвестный тип картинки");
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println("Неизвестный тип картинки");
//        }
        return imageReader;
    }
}
