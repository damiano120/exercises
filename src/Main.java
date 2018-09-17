import exercises1.Exercises1;
import exercises2.Exercises2;
import exercises3.Exercises3;
import exercises4.Exercises4;
import exercises5.Exercises5;
import exercises6.Exercises6;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        boolean trueFalse = true;

        while (trueFalse){
            System.out.println();
            System.out.println("Wybierz pakiet z listy");
            printMenu();
            System.out.print("Twoj wybor to: ");
            switch (scanner.nextInt()) {
                case 0:
                    System.out.print("Menu");
                    printMenu();
                    break;
                case 1:
                    System.out.print("\n" +
                            "Exercises 1 \n" +
                            "");
                    Exercises1 exercises1 = new Exercises1();
                    exercises1.exercises1();
                    break;
                case 2:
                    System.out.print("\n" +
                            "Exercises 2 \n" +
                            "");
                    Exercises2 exercises2 = new Exercises2();
                    exercises2.exercises2();
                    break;
                case 3:
                    System.out.print("\n" +
                            "Exercises 3 \n" +
                            "");
                    Exercises3 exercises3 = new Exercises3();
                    exercises3.exercises3();
                    break;
                case 4:
                    System.out.print("\n" +
                            "Exercises 4 \n" +
                            "");
                    Exercises4 exercises4 = new Exercises4();
                    exercises4.exercises4();
                    break;
                case 5:
                    System.out.print("\n" +
                            "Exercises 5 \n" +
                            "");
                    Exercises5 exercises5 = new Exercises5();
                    exercises5.exercises5();
                    break;
                case 6:
                    System.out.print("\n" +
                            "Exercises 6 \n" +
                            "");
                    Exercises6 exercises6 = new Exercises6();
                    exercises6.exercises6();
                    break;
                case 100:
                    System.out.println("Close program");
                    trueFalse = false;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("0 - Menu \n" +
                "1 - exercises 1 \n" +
                "2 - exercises 2 \n" +
                "3 - exercises 3 \n" +
                "4 - exercises 4 \n" +
                "5 - exercises 5 \n" +
                "6 - exercises 6 \n" +
                "100 - Close program");
    }
}
