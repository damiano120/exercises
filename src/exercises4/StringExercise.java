package exercises4;

import java.util.Iterator;
import java.util.Scanner;

public class StringExercise {

//     Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wyświetla
//informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
//Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ
//ostatnim znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4
//razy.

    public void exerciseString(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz dowolne slowo: ");
        String word = scanner.nextLine();
        char last = word.charAt(word.length()-1);
        char[] tab = word.toCharArray();
//        System.out.println(tab);
        int amount = 0;
        for (int i=0; i<tab.length; i++){
            if (last == tab[i]){
                amount++;
            }
        }
        System.out.println("Ostatnia literka: '"+last+"' wystepuje w slowie "+amount+" razy.");
    }
}
