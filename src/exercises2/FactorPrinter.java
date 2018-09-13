package exercises2;

import java.util.Scanner;

public class FactorPrinter {

//    Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki. Przykładowo,
//dla liczby 21 dzielniki to: 1, 3, 7, 21.

    public void printFactors(){

        Scanner scanner = new Scanner(System.in);
        int number = -1;

        System.out.print("Podaj liczbe dodatnia: ");
        String tempNumber = scanner.nextLine();

        try {
            number = Integer.parseInt(tempNumber);
        } catch (NumberFormatException exc) {
            System.out.println("Nie podales liczby. Podaj liczbe...");
            System.out.println();
            printFactors();
        }

        if(number<1)
            System.out.println("Invalid Value");

        System.out.print("Dzielniki liczby "+ number+" to: ");
        for(int i=1; i<=number; i++){
            if(number%i==0)
                System.out.print(" "+i);
        }
    }
}
