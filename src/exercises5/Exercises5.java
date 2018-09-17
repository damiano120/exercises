package exercises5;

import java.util.Scanner;

public class Exercises5 {

    public void exercises5(){

        Scanner scanner = new Scanner(System.in);

        boolean trueFalse = true;

        while (trueFalse){
            System.out.println();
            System.out.println("Wybierz program z listy");
            printMenu();
            System.out.print("Twoj wybor to: ");
            switch (scanner.nextInt()) {
                case 0:
                    System.out.println("Back to previus Menu");
                    return;
                case 1:
                    System.out.println("\n" +
                            " \n" +
                            "");

                    break;
                case 100:
                    System.out.println("Close program");
                    trueFalse = false;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("0 - Back to previus Menu \n" +
                "1 -  \n" +
                "100 - Close program");
    }
}
