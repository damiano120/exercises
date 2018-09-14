package exercises4;

import java.util.Scanner;

public class StringExercise2 {

//    Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy
//łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
//Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.

    public void exerciseString(){

        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.print("Wpisz dowolne slowo: ");
        word = scanner.nextLine();
        int length = word.length();
        char[] tab = word.toCharArray();
        char[] reverseTab = new char[length];

        for (int i=0; i<tab.length; i++){
            reverseTab[i] = tab[tab.length-i-1];
        }
        System.out.println(reverseTab);

    }
}
