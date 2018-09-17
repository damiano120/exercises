package exercises4;

import java.util.Scanner;

public class StringExercise4 {

//     Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
//Przykład:
//"Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
//Wynik:
//6

    public void exerciseString(){

        Scanner scanner = new Scanner(System.in);
        String sentence;
        int sum = 0;

        System.out.println("Wpisz dowolne zdanie z cyframi: ");
        sentence = scanner.nextLine();

        char[] tab = sentence.toCharArray();
        for (int i=0; i<tab.length; i++){
            if (Character.isDigit(tab[i])){
                int temp = Character.getNumericValue(tab[i]);
                sum +=temp;
            }
        }
        System.out.println("Wynik: "+sum);
    }
}
