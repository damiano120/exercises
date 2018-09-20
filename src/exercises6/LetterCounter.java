package exercises6;

/*
Napisać program, który dla pliku tekstowego o podanej nazwie wyznaczy „wykres”
częstości wystąpień małych liter alfabetu angielskiego. Słupki wykresu mają
zostać utworzone ze znaków gwiazdki ’*’, przy czym długość słupka dla najczęściej
występującej litery powinna wynosić 50. Dodatkowo dla każdego znaku należy dodatkowo
wyświetlić liczbę jego wystąpień.
Poniżej umieszczono przykładowy wykres wygenerowany dla tekstu „Adventures
of Huckleberry Finn” M. Twaina dostępnego pod adresem:
http://www.gutenberg.org/dirs/7/76/76.txt
a ************************************* 36581
b ******* 7439
c ******** 8317
d ************************ 23754
e ************************************************** 49084
f ******** 7914
g ********** 10733
h ************************** 26338
i **************************** 28222
j * 1211
k ***** 5677
l ***************** 17446
m ********** 10337
n ********************************* 32818
o ************************************* 36700
p ****** 5971
q 189
r ******************** 20252
s ************************* 25193
t ******************************************* 42390
u ************** 13954
v ** 2944
w ************* 13347
x 453
y ********** 10312
z 185
 */

import java.io.*;
import java.net.*;

public class LetterCounter {
    public void count() throws Exception {
        URL url = new URL("http://www.gutenberg.org/files/76/76-0.txt");
//        Path path = Paths.get("src\exercises6\program7.txt");
        BufferedReader bufferedReader = null;
        try {
//            bufferedReader = Files.newBufferedReader(path);
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            int lines = 0;
            int[] counter = new int[26];
            char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            int sum = 0;

//            POLICZ ILOSC
            while ((line = bufferedReader.readLine()) != null) {
                char[] tab = line.toCharArray();
                for (char i : tab) {
                    for (int j = 0; j < counter.length; j++) {
                        char aa = 'a';
                        int k = aa;
                        k += j;
                        char letter = (char) k;
                        if (i == letter) {
                            counter[j]++;
                            sum++;
                        }
                    }
                }
            }
//            PRZEDSTAW WYNIKI
            for (int i = 0; i < letters.length; i++) {
                System.out.print(letters[i] + " ");
                int number = counter[i];
                int k = 1;
                for (int j = 0; j < number; j++) {
                    if (k <= 50) {
                        System.out.print("*");
                        k++;
                    }
                }
                System.out.println(" " + counter[i]);
            }

        } catch (FileNotFoundException exc) {
            System.out.println("File error");
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
