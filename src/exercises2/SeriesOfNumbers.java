package exercises2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SeriesOfNumbers {

//    Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
//danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej
//kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
//podanych liczb oraz ich średnią arytmetyczną.
//Przykład:
//Użytkownik podał ciąg: 1, -4, 2, 17, 0.
//Wynik programu:
//13 // suma min. i maks.
//6.5 // średnia

    public void giveNumbers(){

        Scanner scanner = new Scanner(System.in);

        String numbers;
        int number = 0;
        ArrayList<Integer> list = new ArrayList<>();
        boolean trueFalse = true;

        while (trueFalse){
            System.out.println("Podaj ciag liczb i zatwierdz liczba zero");
            System.out.print("Liczby: ");
            numbers = scanner.nextLine();
            String[] itemPieces = numbers.split(" ");
            for (int i=0; i<itemPieces.length; i++){
                String temp = itemPieces[i];
                try {
                    number = Integer.parseInt(temp);
                } catch (NumberFormatException exc){
                    System.out.println("Nie podano liczby. Podaj liczby...");
                    System.exit(0);
                }
                if (number == 0){
                    break;
                }
                list.add(number);
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int i = 0;
            Iterator iterator = list.iterator();
            while (list.size() != i){
                min = Math.min(min, list.get(i));
                max = Math.max(max, list.get(i));
                i++;
            }

            int sum = min + max;
            double tempSum = sum;
            double average = tempSum/2;

            System.out.println("Suma najwiekszej i najmniejszej liczby z podanego ciagu to: " + sum);
            System.out.println("Srednia najwiekszej i najmniejszej liczby z podanego ciagu to: " +average);
            System.out.println();
        }
    }
}
