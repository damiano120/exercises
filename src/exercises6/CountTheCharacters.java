package exercises6;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CountTheCharacters{

    //    Napisać funkcję liczZnakiSlowa, która zlicza:
//• liczbę znaków w pliku,
//• liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znacznik
//końca wiersza),
//• liczbę słów w pliku.
//Wynikiem funkcji jest tablica złożona z 3 liczb całkowitych po jednej dla wymienionych
//podpunktów.


    public void countTheCharacters()throws IOException {

        String fileName = "program1.txt";
        Path pathFile = Paths.get(fileName);
        int charsNumber = 0;
        int whiteChars = 0;
        int wordsNumber = 0;
        String lineSeparator = System.getProperty("line.separator");
        String space = " ";
        String tab = System.getProperty("tabulator");

        Charset charset = Charset.defaultCharset();
        for (String line : Files.readAllLines(pathFile, charset)){
            charsNumber += line.length();
            for (int i=0; i<line.length(); i++){
//                if () ){
//                    whiteChars++;
//                    System.out.println(whiteChars);
//                }
            }

        }
    }


//        String fileName = "program1.txt";
//        Path pathFile = Paths.get(fileName);
//        String sentence = null;
//        ArrayList<String> list = new ArrayList<>();
//
//        sentence = enterData(sentence);
//        saveData(sentence, pathFile);
//        list = loadData(list, pathFile);
//        calculate(sentence);
//    }
//
////    WPROWADZ TEKST
//    public String enterData(String sentence){
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Wprowadz przykladowe zdanie:");
//        sentence = scanner.nextLine();
//
//        return sentence;
//    }
//
////    ZAPISZ TEKST DO PLIKU
//    public boolean saveData(String sentence, Path pathFile) throws IOException {
//        BufferedWriter bufferedWriter = Files.newBufferedWriter(pathFile);
//        try {
//            bufferedWriter.write(sentence);
//            bufferedWriter.newLine();
//        } catch (FileNotFoundException exc){
//            System.out.println("Error");
//            return false;
//        } finally {
//            if (bufferedWriter != null){
//                bufferedWriter.close();
//            }
//        }
//        System.out.println("Pomyslnie zapisano dane do pliku");
//        return true;
//    }
//
////    LADUJ TEKST Z PLIKU
//    public ArrayList loadData(ArrayList list, Path pathFile) throws IOException{
//        BufferedReader bufferedReader = Files.newBufferedReader(pathFile);
//        String fileSentence;
//        try {
//            while ((fileSentence = bufferedReader.readLine()) != null) {
//                list.add(fileSentence);
//            }
//            System.out.println("Wczytano dane z pliku" + list.toString());
//        } catch (FileNotFoundException exc) {
//            System.out.println("Error");
//        } finally {
//            if (bufferedReader != null){
//                bufferedReader.close();
//            }
//        }
//        return list;
//    }
//
////    OBLICZ
//    public void calculate(String sentence){
//        System.out.println(sentence);
//    }
}
