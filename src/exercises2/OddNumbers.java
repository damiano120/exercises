package exercises2;

import java.util.Scanner;

public class OddNumbers {

//    Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie
//wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od
//podanej liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.

    public void showOddNumbers(){

        Scanner scanner = new Scanner(System.in);

        int number;

            System.out.print("Wpisz liczbe calkowita: ");
            number = scanner.nextInt();
            System.out.print("Liczby nieparzyste to:");
            for (int i=0; i<=number; i++){
                if (i%2 == 1){
                    System.out.print(" "+i);
                }
            }
            System.out.println();
            System.out.println();
    }
}
