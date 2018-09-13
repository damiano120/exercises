package exercises2;

import java.util.Scanner;

public class Numbers {

//    Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
//• oblicza sumę cyfr tej liczby,
//• stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej
//cyfr nieparzystych.

    int number = 0;
    int sum = 0;
    double average;

    public void numbers() {

//        POBIERAM DANE OD UZYTKOWNIKA
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe calkowita: ");
        String tempNumber = scanner.nextLine();
        try {
            number = Integer.parseInt(tempNumber);
        } catch (NumberFormatException exc) {
            System.out.println("Nie podales liczby. Podaj liczbe...");
            System.out.println();
            numbers();
        }

//        OBLICZAM SUME LICZB
        int digits = number;
        for (int i = 0; i < number; i++) {
            sum += digits;
            digits--;
        }

//        OBLICZAM SREDNIA
        digits = number;
        int j = 0;
        int k = 0;
        int valueOdd = 0;
        int valueEven = 0;
        for (int i = 0; i < number; i++) {
            if (digits % 2 != 0) {
                valueOdd += digits;
                j++;
                digits--;
            } else {
                valueEven += digits;
                k++;
                digits--;
            }
        }
        double odd = valueOdd / j;
        double even = valueEven / k;
        average = (even + odd) / 2;


        System.out.println("Suma cyf podanej liczby to: " + sum);
        System.out.println("Stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej\n" +
                "cyfr nieparzystych to: " + average);

    }
}