package exercises6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.StringTokenizer;

    /*
    Napisać funkcję emerytura(String nazwaPliku), która wczyta z pliku o podanej
nazwie dane pracowników zapisane w kolejnych wierszach w następujący sposób:
Imię Nazwisko Płeć Wiek
Przykład:
Tomasz Nowak M 45
Marta Ziobro K 42
Jan Kowalski M 27
Ewelina Tusk K 59
Następnie funkcja dla każdego pracownika powinna wyznaczyć ile lat pozostało
do jego emerytury. Wyniki należy zapisać w następujący sposób:
Nazwisko Imię ”Lata do emerytury”
Przykład:
Nowak Tomasz 20
Kowalski Jan 38
Wyniki dla kobiet należy zapisać w pliku o nazwie ”kobiety.txt”, natomiast wyniki
dla mężczyzn należy zapisać w pliku ”mezczyzni.txt”.
     */

    public class Pension {

    public void pension() throws IOException {
        String fileName = "src\\exercises6\\program5Pension.txt";
        calculatePension(fileName);
    }


    public void calculatePension(String fileName) throws IOException {
        Path pathIn = Paths.get(fileName);
        Path pathMen = Paths.get("src\\exercises6\\program5PensionMen.txt");
        Path pathWomen = Paths.get("src\\exercises6\\program5PensionWomen.txt");
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriterMen = null;
        BufferedWriter bufferedWriterWomen = null;
        StringTokenizer stringTokenizer = null;
        final int menAge = 67;  // wiek emerytalny mezczyzn
        final int womenAge = 65;    // wiek emerytalny kobiet
        try {
            bufferedReader = Files.newBufferedReader(pathIn);
            bufferedWriterMen = Files.newBufferedWriter(pathMen);
            bufferedWriterWomen = Files.newBufferedWriter(pathWomen);
            String line = null;
            String temp = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringTokenizer = new StringTokenizer(line);
                ArrayList<String> list = new ArrayList<>();
                while (stringTokenizer.hasMoreTokens()) {
                    temp = stringTokenizer.nextToken();
                    list.add(temp);
                }
                if (list.get(2).equals("M")) {
                    int result = menAge - Integer.parseInt(list.get(3));
                    bufferedWriterMen.write(String.format("%s %s %s",
                            list.get(1),
                            list.get(0),
                            result));
                    bufferedWriterMen.newLine();
                } else if (list.get(2).equals("K")) {
                    int result = womenAge - Integer.parseInt(list.get(3));
                    bufferedWriterWomen.write(String.format("%s %s %s",
                            list.get(1),
                            list.get(0),
                            result));
                    bufferedWriterWomen.newLine();
                }
            }
        } catch (
                IOException exc) {
            System.out.println("Nie znaleziono pliku");
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriterMen != null) {
                bufferedWriterMen.close();
            }
            if (bufferedWriterWomen != null) {
                bufferedWriterWomen.close();
            }
        }
    }
}
