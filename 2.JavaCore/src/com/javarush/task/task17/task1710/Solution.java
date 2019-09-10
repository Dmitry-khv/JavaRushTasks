package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        String name;
        String sex;
        String bd;

        switch (args[0]) {
            case "-c": {
                Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]);
                if (args[2].equals("м")) allPeople.add(Person.createMale(args[1], date));
                if (args[2].equals("ж")) allPeople.add(Person.createFemale(args[1], date));
                System.out.println(allPeople.size() - 1);
                break;
            }
            case "-u": {
                int id = Integer.parseInt(args[1]);
                Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]);
                allPeople.get(id).setName(args[2]);
                allPeople.get(id).setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                allPeople.get(id).setBirthDate(date);
                break;
            }
            case "-d": {
                int id = Integer.parseInt(args[1]);
                Person person = allPeople.get(id);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
                break;
            }
            case "-i": {
                int id = Integer.parseInt(args[1]);
                Person person = allPeople.get(id);
                name = person.getName();
                sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                bd = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate());
                System.out.println(name + " " + sex + " " + bd);
                break;
            }
        }
    }
}
