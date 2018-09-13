package exercises2;

import java.io.BufferedReader;
import java.util.Scanner;

public class GiveZero {

//    Napisać program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki
//nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych
//liczb.

    public void giveZero (){

        Scanner scanner = new Scanner(System.in);

        double numbers = 0;
        double sum = 0;
        String temporary;
        boolean trueFalse = true;

        while (trueFalse){
            System.out.println("Program sumuje podawane liczby dopoki wystapi 0");

            do {
                System.out.print("Podaj liczbe: ");
                temporary = scanner.nextLine();
                try {
                    numbers = Double.parseDouble(temporary);
                } catch (NumberFormatException exc) {
                    System.out.println("Nie podano liczby. Podaj liczbe...");
                    continue;
                }
                sum += numbers;
            }while (numbers != 0);
            System.out.println();
            System.out.println("Suma podanych liczb to: "+sum);
            System.out.println();
        }
    }
}