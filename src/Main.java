import exercises1.*;
import exercises2.Exercises2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz program");
        printMenu();
        System.out.print("Twoj wybor to: ");

        boolean trueFalse = true;

        while (trueFalse){
            switch (scanner.nextInt()) {
                case 0:
                    System.out.println("Menu");
                    printMenu();
                    break;
                case 1:
                    System.out.println("\n" +
                            "Exercises 1 \n" +
                            "");
                    Exercises1 exercises1 = new Exercises1();
                    exercises1.exercises1();
                    break;
                case 2:
                    System.out.println("\n" +
                            "Exercises 2 \n" +
                            "");
                    Exercises2 exercises2 = new Exercises2();
                    exercises2.exercises2();
                    break;
                case -1:
                    System.out.println("Quit program");
                    trueFalse = false;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("0 - Menu \n" +
                "1 - exercises 1 \n" +
                "2 - exercises 2 \n" +
                "-1 - Quit program");
    }
}
