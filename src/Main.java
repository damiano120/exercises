import exercises1.Exercises1;
import exercises2.Exercises2;
import exercises3.Exercises3;
import exercises4.Exercises4;
import exercises5.Exercises5;
import exercises6.Exercises6;
import exercises7.Exercises7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

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
                            "Basics \n" +
                            "");
                    Exercises1 exercises1 = new Exercises1();
                    exercises1.exercises1();
                    break;
                case 2:
                    System.out.print("\n" +
                            "Loops \n" +
                            "");
                    Exercises2 exercises2 = new Exercises2();
                    exercises2.exercises2();
                    break;
                case 3:
                    System.out.print("\n" +
                            "Tables \n" +
                            "");
                    Exercises3 exercises3 = new Exercises3();
                    exercises3.exercises3();
                    break;
                case 4:
                    System.out.print("\n" +
                            "String \n" +
                            "");
                    Exercises4 exercises4 = new Exercises4();
                    exercises4.exercises4();
                    break;
                case 5:
                    System.out.print("\n" +
                            "String (more) \n" +
                            "");
                    Exercises5 exercises5 = new Exercises5();
                    exercises5.exercises5();
                    break;
                case 6:
                    System.out.print("\n" +
                            "Txt files \n" +
                            "");
                    Exercises6 exercises6 = new Exercises6();
                    exercises6.exercises6();
                    break;
                case 7:
                    System.out.print("\n" +
                            "Objects \n" +
                            "");
                    Exercises7 exercises7 = new Exercises7();
                    exercises7.exercises7();
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
                "1 - Basics \n" +
                "2 - Loops \n" +
                "3 - Tables \n" +
                "4 - String \n" +
                "5 - String (more) \n" +
                "6 - Txt files \n" +
                "7 - Objects \n" +
                "100 - Close program");
    }
}
