package exercises2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exponentiation {

//     Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
//następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana
//liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
//1 2 4 8 16 32 64

    public void exponentiation(){

        Scanner scanner = new Scanner(System.in);

        int number;
        ArrayList<Integer> list = new ArrayList<Integer>();

            System.out.println("Podaj liczbe calkowita dodatnia");
            number = scanner.nextInt();
            if (number<1){
                System.out.println("Liczba musi byc calkowita dodatnia");
                return;
            }
            int temp = 0;
            while (Math.pow(2, temp) <= number){
                double temp2 = Math.pow(2, temp);
                temp++;
                int temp3 = (int)temp2;
                list.add(temp3);
            }
            System.out.println("Wszystkie potegi liczby " + number + " to: " + list.toString());
            System.out.println();
    }
}
