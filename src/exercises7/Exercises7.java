package exercises7;

//  Zajecia 7 - Objects

import java.util.Scanner;

public class Exercises7 {
    public void exercises7(){

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
                            "Orders \n" +
                            "");
                    Orders orders = new Orders();
                    orders.orders();
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
                "1 - Orders \n" +
                "100 - Close program");
    }
}
