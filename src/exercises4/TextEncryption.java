package exercises4;

import java.util.Scanner;

public class TextEncryption {

//    Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu
//szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
//monoalfabetycznego.
//Użytkownik program podaje tekst do zaszyfrowania oraz liczbę n, o którą przesunięty
//jest alfabet za pomocą którego szyfrujemy tekst. Dla uproszczenia można
//przyjąć, że łańuch wejściowy składa się tylko z małych liter alfabetu angielskiego,
//tj. ’a’ – ’z’ (26 znaków) oraz spacji.
//Przykład 1.
//Podaj łańcuch znaków do zaszyfrowania: abrakadabraz
//Podaj przesunięcie: 2
//Zaszyfrowany tekst: cdtcmcfcdtcb
//Przykład 2.
//Podaj łańcuch znaków do zaszyfrowania: cdtcmcfcdtcb
//Podaj przesunięcie: -2
//Zaszyfrowany tekst: abrakadabraz

    public void encryptionText(){

        Scanner scanner = new Scanner(System.in);
        String sentence;
        int key;

        System.out.println("Wpisz dowolny tekst do zaszyfrowania:");
        sentence = scanner.nextLine();
        System.out.print("Wybierz szyfrowanie (podaj cyfre): ");
        key = scanner.nextInt();

        char[] tab = sentence.toCharArray();
        for (int i=0; i<tab.length; i++){
            int n = tab[i];
            n += key;
            tab[i] =(char)n;
        }
        System.out.print("Zaszyfrowany tekst to: ");
        System.out.println(tab);
    }
}
