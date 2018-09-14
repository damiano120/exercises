package exercises4;

import java.util.Scanner;

public class Exercises4 {

//    Zajęcia 4 – łańcuchy znaków (String)

    public void exercises4(){
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
                            "String exercise \n" +
                            "");
                    StringExercise program1 = new StringExercise();
                    program1.exerciseString();
                    break;
                case 2:
                    System.out.println("\n" +
                            "String exercise 2 \n" +
                            "");
                    StringExercise2 program2 = new StringExercise2();
                    program2.exerciseString();
                    break;
                case 3:
                    System.out.println("\n" +
                            "Palindrome \n" +
                            "");
                    Palindrome program3 = new Palindrome();
                    program3.palindrome();
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
                "1 - String exercise \n" +
                "2 - String exercise 2 \n" +
                "3 - Palindrome \n" +
                "100 - Quit program");
    }
}
