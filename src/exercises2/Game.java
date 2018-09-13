package exercises2;

import java.util.Scanner;

public class Game {

//    Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
//(użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych
//wartości. Jeżeli podana wartość jest:
//• większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
//• mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
//• identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra
//się kończy.

    public void game(){

        Scanner scanner = new Scanner(System.in);

        double temporaryRandomNumber;
        int randomNumber;
        int userNumber = 0;
        boolean trueFalse = true;

        System.out.println("Odgadnij liczbe z zakresu od 1 do 100");
        temporaryRandomNumber = Math.random() * 100;
        randomNumber = (int) temporaryRandomNumber;

        while (trueFalse) {
            System.out.print("Twoja liczba: ");

            String temporaryUserNumber = scanner.nextLine();
            try {
                userNumber = Integer.parseInt(temporaryUserNumber);
            } catch (NumberFormatException exc) {
                System.out.println("Nie podales liczby. Podaj liczbe...");
                System.out.println();
                game();
            }

            if (userNumber > randomNumber) {
                System.out.println("Podales za duza wartosc. Probuj dalej...");
                continue;
            } else if (userNumber < randomNumber){
                System.out.println("Podales za mala wartosc. Probuj dalej...");
                continue;
            } else {
                System.out.println("Gratulacje. Podana liczba jest prawidlowa");
                break;
            }
        }
    }
}
