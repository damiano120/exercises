package exercises1;

import java.util.Scanner;

public class Calculator {

//Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie
//operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach
//rzeczywistych. Program ma identyfikować sytuację wprowadzenia błędnego
//symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch
//do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu
//operacji. Scenariusz działania programu:
//a) Program wyświetla informację o swoim przeznaczeniu.
//b) Wczytuje pierwszą liczbę.
//c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
//d) Wczytuje drugą liczbę.
//e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.

    public void calculate(){

        Scanner scanner = new Scanner(System.in);

        double value1;
        double value2;
        String symbolScan;
        char symbol;
        double result;

            System.out.println("Wprowadz liczby");
            System.out.println("Pierwsza liczba: ");
            value1 = scanner.nextDouble();
            System.out.println("Podaj symbol operacji +, -, *, / ");
            symbolScan = scanner.next();
            symbol = symbolScan.charAt(0);
            if (symbol != '+' && symbol != '-' && symbol != '*' && symbol != '/'){
                System.out.println("Nieprawidłowy znak dzialania. Podaj symbol operacji +, -, *, / ");
                return;
            }
            System.out.println("Druga liczba: ");
            value2 = scanner.nextDouble();
            if (symbol == '+'){
                result = value1+value2;
                System.out.println("Wynik dzialania "+ value1 +" + "+ value2 +" = "+ result);
            } else if (symbol == '-'){
                result = value1 - value2;
                System.out.println("Wynik dzialania "+ value1 +" - "+ value2 +" = "+ result);
            } else if ( symbol == '*'){
                result = value1*value2;
                System.out.println("Wynik dzialania "+ value1 +" * "+ value2 +" = "+ result);
            } else{
                if (value2 == 0){
                    System.out.println("Nie mozna dzielic przez 0");
                    return;
                }
                result = value1/value2;
                System.out.println("Wynik dzialania "+ value1 +" / "+ value2 +" = "+ result);
            }
            System.out.println();
    }
}
