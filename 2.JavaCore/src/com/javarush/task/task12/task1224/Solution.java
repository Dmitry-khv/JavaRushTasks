package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код

        if (o instanceof Cat || o instanceof Tiger || o instanceof Lion || o instanceof Bull)
        return o.toString();
        else
        return "Животное";
    }

    public static class Cat {
        @Override
        public String toString() {
            return "Кот";
        }
    }

    public static class Tiger {
        @Override
        public String toString() {
            return "Тигр";
        }
    }

    public static class Lion {
        @Override
        public String toString() {
            return "Лев";
        }
    }

    public static class Bull {
        @Override
        public String toString() {
            return "Бык";
        }
    }

    public static class Pig {
        @Override
        public String toString() {
            return "Животное";
        }
    }
}
