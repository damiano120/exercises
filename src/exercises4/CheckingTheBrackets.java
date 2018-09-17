package exercises4;

import java.util.Scanner;

public class CheckingTheBrackets {

//    Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
//arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako
//pojedynczy łańcuch znaków. Program powinien wyświetlić stosowny komunikat.
//Przykład a:
//"2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"
//Wynik:
//Błędne sparowanie nawiasów
//Przykład b:
//"2 * (3.4 - (-7)/2)*(a-2)/(b-1)"
//Wynik:
//OK

    public void checkTheBrackets(){

        Scanner scanner = new Scanner(System.in);
        String expression;

        System.out.println("Podaj wyrazenie matematyczne z nawiasami: ");
        expression = scanner.nextLine();

        char[] tab = expression.toCharArray();
        char bracket1 = '(';
        char bracket2 = ')';
        int brackets1 = 0;
        int brackets2 = 0;

        for (char i : tab){
            if (i == bracket1){
                brackets1++;
            } else if ( i == bracket2){
                brackets2++;
            }
        }
        if (brackets1 == brackets2){
            System.out.println("Prawidlowe sparowanie nawiasow");
        } else{
            System.out.println("Bledne sparowanie nawiasow");
        }
    }
}
