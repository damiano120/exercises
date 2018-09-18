package exercises6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Encryption {

/*
Stworzyć dwie funkcje:
void szyfruj(String nazwaWe, int przesun)
void deszyfruj(String nazwaWe, int przesun)
Funkcja szyfruj dokonuje szyfrowania pliku, którego nazwa podana została jako
pierwszy parametr. Szyfrowanie polega na zamianie każdej litery na znak przesunięty
o wartość podaną drugim parametrem np. dla przesunięcia równego 2 literka
’a’ powinna zostać zastąpiona literką ’c’, literka ’z’ literką ’b’ itp.
Wynikiem działania funkcji ma być plik o nazwie utworzonej na podstawie nazwy
pliku wejściowego poprzez dołączenie znaku ’_’ np. dla pliku dane.txt zaszyfrowana
postać powinna mieć nazwę _dane.txt. Funkcja deszyfruj powinna deszyfrować plik
(niekoniecznie ten sam) zaszyfrowany przez funkcję szyfruj.
 */

    public void encryption() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String inFileNameEncrypt = "src\\exercises6\\program4EncryptIn.txt";
        String inFileNameDecrypt = "src\\exercises6\\program4DecryptIn.txt";
        String temporary1, temporary2;
        int keyEncryption = 0;
        int keyDecryption = 0;
        String choice = null;

        System.out.print("Chesz zaszyfrowac(1) czy zdeszyfrowac(2) plik: ");
        choice = scanner.nextLine();

        if (choice.equals("1")){
            System.out.print("Wprowadz szyfrowanie(przesuniecie o ilosc): ");
            temporary1 = scanner.nextLine();
            try {
                keyEncryption = Integer.parseInt(temporary1);
                encrypt(inFileNameEncrypt, keyEncryption);
            } catch (Exception exc) {
                System.out.println("Błędne dane szyfrujace. Podaj liczbe. ");
            }
        } else if (choice.equals("2")){
            System.out.print("Wprowadz deszyfrowanie (powrotne przesuniecie o ilosc): ");
            temporary2 = scanner.nextLine();
            try {
                keyDecryption = Integer.parseInt(temporary2);
                decrypt(inFileNameDecrypt, keyDecryption);
            } catch (Exception exc) {
                System.out.println("Błędne dane deszyfrujace. Podaj liczbe. ");
            }
        } else {
            System.out.println("Bledny wybor");
        }
    }

//    SZYFRUJ PLIK
    public void encrypt(String inFileName, int key) throws IOException {

        Path pathIn = Paths.get(inFileName);
        Path pathOut = Paths.get("src\\exercises6\\program4EncryptOut.txt");
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = Files.newBufferedReader(pathIn);
            bufferedWriter = Files.newBufferedWriter(pathOut);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                char[] tab = line.toCharArray();
                for (int i = 0; i < tab.length; i++) {
                    int n = tab[i];
                    n += key;
                    tab[i] = (char) n;
                }
                bufferedWriter.write(tab);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Nie znaleziono pliku");
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
    }

//    DESZYFRUJ PLIK
    public void decrypt(String outFileName, int key) throws IOException {
        Path pathIn = Paths.get(outFileName);
        Path pathOut = Paths.get("src\\exercises6\\program4DecryptOut.txt");
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = Files.newBufferedReader(pathIn);
            bufferedWriter = Files.newBufferedWriter(pathOut);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                char[] tab = line.toCharArray();
                for (int i = 0; i < tab.length; i++) {
                    int n = tab[i];
                    n += key;
                    tab[i] = (char) n;
                }
                bufferedWriter.write(tab);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Nie znaleziono pliku");
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
    }
}
