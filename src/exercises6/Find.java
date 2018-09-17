package exercises6;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Find {

//    Napisać funkcję:
//public void szukaj(String nazwaPlikWe, String nazwaPlikWy,
//String slowo)
//której zadaniem jest znalezienie wszystkich wierszy w pliku, które zawierają szukane
//słowo. Wszystkie wiersze, które zawierają słowo powinny zostać zapisane w
//pliku wynikowym wraz z nr wiersza (z pierwszego pliku). Nazwa pierwszego pliku
//zapamiętana jest w parametrze nazwaPlikWe, nazwa pliku wynikowego podana
//jest w parametrze nazwaPlikWy, natomiast szukane słowo w parametrze slowo.
//Przykład - plik wejściowy:
//Ala ma jutro egzamin z biologii.
//Jan myje auto.
//Eh, jutro kolejny egzamin.
//Nie lubie polityki.
//Jeżeli szukanym słowem byłoby ”egzamin”, to plik wynikowy powinien wyglądać
//następująco:
//1: Ala ma jutro egzamin z biologii.
//3: Eh, jutro kolejny egzamin.

    private Scanner scanner = new Scanner(System.in);

    public void find() throws IOException {

        String word = null;
        String inFilePath = null;
        String outFilePath = null;

        inFilePath = inFilePath(inFilePath);
        outFilePath = outFilePath(outFilePath);
        word = enterData(word);
        finder(inFilePath, outFilePath, word);
    }

    //  WPROWADZ SCIEZKE PLIKU WEJSCIOWEGO
    public String inFilePath(String inFilePath) {
        System.out.println("Wprowadz sciezke pliku wejsciowego: ");
        inFilePath = scanner.nextLine();
        return inFilePath;
    }

    //  WPROWADZ SCIEZKE PLIKU WYJSCIOWEGO
    public String outFilePath(String outFilePath) {
        System.out.println("Wprowadz sciezke pliku wyjsciowego: ");
        outFilePath = scanner.nextLine();
        return outFilePath;
    }

    //    WPROWADZ SZUKANY TEKST
    public String enterData(String word) {
        System.out.print("Wprowadz szukany tekst: ");
        word = scanner.nextLine();
        word = word.toLowerCase();
        return word;
    }

    //    SZUKAJ
    public boolean finder(String inFileName, String outFileName, String word) throws IOException {
        int lineNumber = 0;
        int tempNumber = -1;
        Path pathIn = Paths.get(inFileName);
        Path pathOut = Paths.get(outFileName);
        BufferedWriter bufferedWriter = Files.newBufferedWriter(pathOut);

        for (String line : Files.readAllLines(pathIn)) {
            String tempLine = line.toLowerCase();
            lineNumber++;
            if ((tempNumber = tempLine.indexOf(word)) != -1) {
                String lineFile = lineNumber + ": " + line;
                try {
                    bufferedWriter.write(lineFile);
                    bufferedWriter.newLine();
                } catch (FileNotFoundException exc) {
                    System.out.println("Error");
                    return false;
                }
            }
        }
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        System.out.println("Pomyslnie zapisano dane do pliku");
        return true;
    }
}
