package exercises4;

import java.util.Scanner;

public class Palindrome {

//    Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie sprawdza,
//czy podany ciąg jest palindromem.

    public void palindrome(){

        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.print("Wpisz slowo typu palindrom: ");
        word = scanner.nextLine();
        char[] tab = word.toCharArray();
        int length = word.length();
        int temp = 0;
        for (int i=0; i<tab.length; i++){
            if (tab[i] == tab[length-1-i]){
                temp++;
            }
        }
        if (length == temp){
            System.out.println("Wyraz jest palindromem");
        }else {
            System.out.println("Wyraz nie jest palindromem");
        }
    }
}
