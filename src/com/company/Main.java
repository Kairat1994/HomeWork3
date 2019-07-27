package com.company;

public class Main {

    public static void main(String[] args) {

        String names[] = new String[]{"John", "Albert", "Bob"};


        for (String name : names) {

            switch (name) {
                case "John":
                    System.out.println("Good morning!" + " " + name);
                    break;
                case "Albert":
                    System.out.println("Good day!" + " " + name);
                    break;
                case "Bob":
                    System.out.println("Good evening! " + " " + name);
            }
        }
    }
}
