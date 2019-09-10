package com.javarush.task.task17.task1711;

import com.sun.javafx.binding.StringFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        switch (args[0]) {
            case "-c": {
                for (int i = 0; i < args.length - 4; i++) {
                    Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]);
                    if (args[i + 2].equals("ж")) {
                        allPeople.add(Person.createFemale((args[i + 1]), date));
                    } else {
                        allPeople.add(Person.createMale((args[i + 1]), date));
                    }
                }
            }

            case "-u": {
                for (int i = 1; i < args.length - 5; i++) {
                    Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]);
                    int id = Integer.parseInt(args[i]);
                    Person person = allPeople.get(id);
                    person.setName(args[i+1]);
                    person.setSex(args[i+2].equals("м") ? Sex.MALE : Sex.FEMALE);
                    person.setBirthDate(date);
                }
            }

            case "-d": {
                for (int i = 1; i < args.length-1; i++) {
                    int id = Integer.parseInt(args[i]);
                    Person person = allPeople.get(id);
                    person.setName(null);
                    person.setSex(null);
                    person.setBirthDate(null);
                }
            }

            case "-i": {
                for (int i = 1; i < args.length-1; i++) {
                    int id = Integer.parseInt(args[i]);
                    Person person = allPeople.get(id);
                    String name = person.getName();
                    String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                    String bd = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate());
                    System.out.println(name + " " + sex + " " + bd);
                }
            }
        }
    }
}
