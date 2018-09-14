package exercises3;

import java.util.Random;

public class TableExercise {

//    Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10,
//a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza
//się w tablicy.
//Przykład:
//Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
//Wystąpienia:
//1 - 1
//2 - 1
//3 - 3
//4 - 3
//5 - 3
//6 - 4
//7 - 1
//8 - 2
//9 - 0
//10 - 2

    public void exerciseTable(){

        int[] tab = new int[20];
        int temp;
        Random random = new Random();

        for (int i=0; i<tab.length; i++) {
            temp = random.nextInt(9)+1;
            tab[i] = temp;
        }
        System.out.println("Wylosowane liczby:");
        for (int i : tab){
            System.out.print(i + " ");
        }
    }
}
