package exercises2;

import java.util.Scanner;

public class Exercises2 {

//    Zajęcia 2 – instrukcje warunkowe, pętle

    public void exercises2(){

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
                            "Odd numbers \n" +
                            "");
                    OddNumbers program1 = new OddNumbers();
                    program1.showOddNumbers();
                    break;
                case 2:
                    System.out.println("\n" +
                            "Sum of the sequence of numbers \n" +
                            "");
                    SumOfTheSequenceOfNumbers program2 = new SumOfTheSequenceOfNumbers();
                    program2.printSum();
                    break;
                case 3:
                    System.out.println("\n" +
                            "Exponentiation \n" +
                            "");
                    Exponentiation program3 = new Exponentiation();
                    program3.exponentiation();
                    break;
                case 4:
                    System.out.println("\n" +
                            "Give zero \n" +
                            "");
                    GiveZero program4 = new GiveZero();
                    program4.giveZero();
                    break;
                case 5:
                    System.out.println("\n" +
                            "Series of numbers \n" +
                            "");
                    SeriesOfNumbers program5 = new SeriesOfNumbers();
                    program5.giveNumbers();
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
                "1 - Show odd numbers \n" +
                "2 - Sum of the sequence of numbers \n" +
                "3 - Exponentiation \n" +
                "4 - Give zero \n" +
                "5 - Series of numbers \n" +
                "-1 - Quit program");
    }
}