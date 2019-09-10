package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            exceptions.get(10);
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            FileInputStream fileInputStream= new FileInputStream("c://sdf/sdf/");
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new Exception();
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new ClassCastException();
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new NullPointerException();
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new NoSuchFieldException();
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new RuntimeException();
        } catch (Exception e) {
            exceptions.add(e);
        } try {
            throw new NoSuchMethodException();
        } catch (Exception e) {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
