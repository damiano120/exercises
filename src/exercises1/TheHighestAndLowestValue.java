package exercises1;

import java.util.Scanner;

public class TheHighestAndLowestValue {

//    Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
//      najmniejszą z nich.

    public void showValue(){

        Scanner scanner = new Scanner(System.in);

        int value1;
        int value2;
        int value3;
        boolean trueFalse = true;

        while (trueFalse) {
            System.out.println("Podaj 3 liczby calkowite ");
            System.out.print("Liczba pierwsza: ");
            value1 = scanner.nextInt();
            System.out.print("Liczba druga: ");
            value2 = scanner.nextInt();
            System.out.print("Liczba trzecia: ");
            value3 = scanner.nextInt();

            int temporaryMax = Integer.max(value1, value2);
            int max = Integer.max(temporaryMax, value3);

            int temporaryMin = Integer.min(value1, value2);
            int min = Integer.min(temporaryMin, value3);

            System.out.println("Najwieksza z podanych liczb to: " + max);
            System.out.println("Najmniejsza z podanych liczb to: " + min);
            System.out.println();

        }
    }
}
