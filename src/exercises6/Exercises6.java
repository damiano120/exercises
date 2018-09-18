package exercises6;

import java.io.IOException;
import java.util.Scanner;

public class Exercises6 {

//    Zajęcia 6 – pliki tekstowe

    public void exercises6()throws IOException {

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
                            "Count the charaters \n" +
                            "");
                    CountTheCharacters program1 = new CountTheCharacters();
                    program1.countTheCharacters();
                    break;
                case 2:
                    System.out.println("\n" +
                            "Find \n" +
                            "");
                    Find program2 = new Find();
                    program2.find();
                    break;
                case 3:
                    System.out.println("\n" +
                            "Sum and save \n" +
                            "");
                    SumAndSave program3 = new SumAndSave();
                    program3.sum();
                    break;
                case 4:
                    System.out.println("\n" +
                            "Encryption \n" +
                            "");
                    Encryption program4 = new Encryption();
                    program4.encryption();
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
                "1 - Count the characters - nie ukonczony \n" +
                "2 - Find \n" +
                "3 - Sum and save \n" +
                "4 - Encryption \n" +
                "100 - Close program");
    }
}
