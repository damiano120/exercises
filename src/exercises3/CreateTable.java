package exercises3;

import java.util.Random;

public class CreateTable {

//    Napisać program, który:
//• utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z
//przedziału [−10, . . . , 10],
//• wypisze na ekranie zawartość tablicy,
//• wyznaczy najmniejszy oraz najwięszy element w tablicy,
//• wyznaczy średnią arytmetyczną elementów tablicy,
//• wyznaczy ile elementów jest mniejszych, ile większych od średniej.
//• wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego
//do pierwszego.
//Wszystkie wyznaczone wartości powinny zostać wyświetlone na ekranie.
//Wylosowane liczby:
//-3 9 2 -10 -3 -4 -1 -5 -10 8
//Min: -10, max: 9
//Średnia: -1,00
//Mniejszych od śr.: 6
//Większych od śr.: 3
//Liczby w odwrotnej kolejności:
//8 -10 -5 -1 -4 -3 -10 2 9 -3

    public void createTable() {

//        WYPELNIJ TABLICE
        int[] table = new int[10];
        Random random = new Random();
        for (int i=0; i<table.length; i++) {
            int value = random.nextInt(21) - 10;
            table[i] = value;
        }

//        WYPISZ ZAWARTOSC TABLICY
        System.out.println("Wylosowane liczby:");
        for (int i : table) {
            System.out.print(" " + i);
        }
        System.out.println();

//        WYZNACZ NAJMNIEJSZY I NAWJWIEKSZY ELEMENT TABLICY
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : table) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        System.out.println("Min: " + min + " Max: " + max);

//        WYZNACZ SREDNIA ARYTMETYCZNA ELEMENTOW TABLICY
        int sum = 0;
        int average = 0;
        for (int i : table) {
            sum += i;
        }
        average = sum / table.length;
        System.out.println("Srednia: " + average);

//        WYZNACZ ELEMENTY WIEKSZE I MNIEJSZE OD SREDNIEJ
        int smaller = 0;
        int bigger = 0;
        for (int i : table) {
            if (i > average){
                bigger++;
            } else {
                smaller++;
            }
        }
        System.out.println("Liczb mniejszych od sredniej: "+smaller);
        System.out.println("Liczb wiekszych od sredniej: "+bigger);

//        WYPISZ ELEMENTY W ODWROTNEJ KOLEJNOSCI
        int[] tab2 = new int[10];
        for (int i=0; i<table.length; i++){
            tab2[i] = table[table.length-1-i];
        }
        System.out.println("Liczby w odwrotnej kolejnosci:");
        for (int i : tab2) {
            System.out.print(" " + i);
        }
    }
}
