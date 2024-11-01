package inlamningsuppgift_first;

//Pierre LEMON
//Mjukvarutestning utbildning


//import area

import java.util.Scanner;
import java.util.ArrayList;


public class collectionModules {


    // attributer

    private int TotalChars = 0;
    private int TotalLines = 0;
    private String longestString = " ";
    String getValue;

    //    New class
    ArrayList<String> longest = new ArrayList<>();
    Scanner inputing = new Scanner(System.in);
    LogikClass logik = new LogikClass();

    static class LogikClass {
        public boolean isStop(String getValue) {
            return "stopp".equalsIgnoreCase(getValue);
        }
    }

    //just for fun, this is not included in the case
    static void Tack() {

        {
            String[] tack = new String[]{
                    "*****  ***   ****  *  *",
                    "  *   *   *  *     * * ",
                    "  *   *****  *     *** ",
                    "  *   *   *  *     * * ",
                    "  *   *   *   **** *  *"
            };

            for (String line : tack) {
                System.out.println(line);

            }
        }
    }

//    Going through simple for loop to check which of strings is longest
//    string and prints out result


    public void checkString() {


        for (String s : longest) {
            if (s.length() > longestString.length()) {
                longestString = s;
            }
        }
    }

    // Constructor

//    return count of chars

    public int getTotalChars() {

        return TotalChars;
    }

//return count of lines

    public int getTotalLines() {

        return TotalLines;
    }

//    Return longest string

    public String getLongestString() {

        return longestString;
    }


    //    Just for fun to write more text after when loop is stopped
    static void sayBye() {
        System.out.println(" ");
        System.out.println("Tack för att du använt vår tjänst!");

    }

    //test
    public void countCharAndLine(String line) {
        TotalChars += line.length();
        TotalLines++;
    }


    // metoder

    //Adds all inner class into printLoopForInput for printing in collectionMain
    public void printLoopForInput() {
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }
        System.out.println("Skriv in text. Avsluta med 'stopp'");


        do {
            getValue = inputing.nextLine();
//            More other methods can used is contains
//            or matches but this method is better
//            because this checks either not uppercase or
//            lowercase


            if (logik.isStop(getValue)) {
                System.out.println("Du har valt att avsluta!");
                System.out.println(" ");


                break;
            }

//            Possible to use other solution is if
//            if (getValue.equalsIgnoreCase("stopp")) {
//
//      System.out.println("Du har valt att avsluta!");
//                System.out.println(" ");
//
//
//                break;}
//
//            }
//            There is more other methods to remove whitespace following
//            alternative is split, replaceAll and use regex syntax.

            getValue = getValue.replaceAll("\\s+", "");
            countCharAndLine(getValue);
            longest.add(getValue);
            checkString();


        }

        while (true);

//        printing area
        System.out.println("Totala bokstäver som har skrivits blir " + getTotalChars());
        System.out.println("Totala rader genom loop blir antal rad " + getTotalLines());
        System.out.println("Det längsta ordet av alla du skrev är \n" + getLongestString() + "\noch antal bokstav blir " + getLongestString().length());

        sayBye();
        Tack();

//        Scanner closes completely
        inputing.close();


    }


}
