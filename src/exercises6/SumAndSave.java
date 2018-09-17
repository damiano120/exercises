package exercises6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class SumAndSave {

//    Napisać funkcję public void sumujIZapisz(String nazwaPliku) , która
//odczytuje plik o podanej nazwie zawierający liczby całkowite (po jednej w
//wierszu). Funkcja ma za zadanie odczytać i zsumować wszystkie liczby z pliku,
//a następnie dopisać na końcu pliku wyznaczoną sumę. Ponowne
//uruchomienia funkcji będą skutkowały dopisywaniem kolejnych wierszy. Jeżeli
//plik nie istnieje to ma zostać utworzony – suma dla pustego pliku wyniesie 0, a
//więc należy dopisać wiersz zawierający 1.

    public void sum() throws IOException {
        String fileName = "src\\exercises6\\program3.txt";
        sumAndSave(fileName);
    }

    public void sumAndSave(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        ArrayList<Integer> list = new ArrayList<Integer>();

//        try {
//            BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
//            BufferedReader bufferedReader = Files.newBufferedReader(path);
////            bufferedReader.close();
////            bufferedWriter.close();
//        } catch (NoSuchFileException exc2) {
//            System.out.println("File not found");
//        }
        BufferedReader bufferedReader = Files.newBufferedReader(path);
        int sum = 0;
        String numbers;
        while ((numbers = bufferedReader.readLine()) != null){
            int num = Integer.parseInt(numbers.trim());
            list.add(num);
            sum += num;
        }
        BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
        if (sum == 0) {
            int tmp = 1;
            bufferedWriter.write(tmp);
            bufferedWriter.newLine();
            bufferedReader.close();
            bufferedWriter.close();
            return;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object number = iterator.next();
            bufferedWriter.write(number.toString());
            bufferedWriter.newLine();
        }
        String result = String.valueOf(sum);
        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
