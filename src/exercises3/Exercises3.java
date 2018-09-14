package exercises3;

import java.util.Scanner;

public class Exercises3 {

//    Zajęcia 3 – tablice

    public void exercises3(){

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
                            "Create table 1 \n" +
                            "");
                    CreateTable program1 = new CreateTable();
                    program1.createTable();
                    break;
                case 2:
                    System.out.println("\n" +
                            "Table exercise \n" +
                            "");
                    TableExercise program2 = new TableExercise();
                    program2.exerciseTable();
                    break;
                case 100:
                    System.out.println("Quit program");
                    trueFalse = false;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("0 - Menu \n" +
                "1 - Create table \n" +
                "2 - Table exercise \n" +
                "100 - Quit program");
    }
}