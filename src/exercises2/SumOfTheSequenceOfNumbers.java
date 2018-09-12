package exercises2;

import java.util.Scanner;

public class SumOfTheSequenceOfNumbers {

//    Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B,
//A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu
//(A, A + 1, . . . , B). Obliczenia należy wykonać trzykrotnie stosując kolejno pętle:
//while, do-while, for.
//Przykład:
//Dla A = 4 i B = 11 program powinien wyświetlić:
//60
//60
//60

    public void printSum(){

        Scanner scanner = new Scanner(System.in);

        int value1;
        int value2;
        int sum;
        int temp;
        boolean trueFalse = true;

        while (trueFalse){
            System.out.println("Podaj liczby");
            System.out.print("Pierwsza liczba: ");
            value1 = scanner.nextInt();
            System.out.print("Druga liczba: ");
            value2 = scanner.nextInt();
            if (value2 < value1){
                System.out.println("Druga liczba musi byc wieksza od pierwszej");
                continue;
            }

            //            PETLA WHILE
            sum = 0;
            temp = value1;
            while (temp <= value2){
                sum += temp;
                temp++;
            }
            System.out.println("Suma ciagu liczb to: " + sum);

            //            PETLA DO WHILE
            sum = 0;
            temp = value1;
            do {
                sum += temp;
                temp++;
            } while (temp <= value2);
            System.out.println("Suma ciagu liczb to: " + sum);

//            PETLA FOR
            sum = 0;
            for (temp = value1; temp<=value2; temp++){
                sum += temp;
            }
            System.out.println("Suma ciagu liczb to: " + sum);
        }
    }
}
