package exercises6;

/*
 Napisać funkcję, której zadaniem jest odczytanie danych tabelarycznych z pliku
tekstowego, a następnie zapisanie ich do nowego pliku w postaci kodu HTML.
Przykład:
Wejście:
"Waga" "Wzrost" "BMI" "Nadwaga"
70 1,8 21,6 "NIE"
67 1,77 21,39 "NIE"
85 1,7 29,41 "TAK"
100 1,92 27,13 "TAK"
Wynik:
<html><body>
<table>
<tr><td>"Waga"</td><td>"Wzrost"</td><td>"BMI"</td><td>"Nadwaga"</td></tr>
<tr><td>70</td><td>1,8</td><td>21,6</td><td>"NIE"</td></tr>
<tr><td>67</td><td>1,77</td><td>21,39</td><td>"NIE"</td></tr>
<tr><td>85</td><td>1,7</td><td>29,41</td><td>"TAK"</td></tr>
<tr><td>100</td><td>1,92</td><td>27,13</td><td>"TAK"</td></tr>
</table>
</body></html>
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Table {

    public void table() throws IOException {
        Path pathIn = Paths.get("src\\exercises6\\program6TableIn.txt");
        Path pathOut = Paths.get("src\\exercises6\\program6TableOut.txt");
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
//        String regex = "[\\p{Punct}*\\w+\\p{Punct}*\\w+\\p{Punct}* ]+";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher;
        try {
            bufferedReader = Files.newBufferedReader(pathIn);
            bufferedWriter = Files.newBufferedWriter(pathOut);
            bufferedWriter.write("<html><body>");
            bufferedWriter.newLine();
            bufferedWriter.write("<table>");
            bufferedWriter.newLine();
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
//                 matcher = pattern.matcher(line);
//                 boolean match = matcher.matches();
//                System.out.println(match);
                String[] strings = line.split(" ");
                bufferedWriter.write("<tr>");
                for (String str : strings){
                    bufferedWriter.write("<td>");
                    bufferedWriter.write(str);
                    bufferedWriter.write("</td>");
                }
                bufferedWriter.write("</tr>");
                bufferedWriter.newLine();
            }
            bufferedWriter.write("</table>");
            bufferedWriter.newLine();
            bufferedWriter.write("</body></html>");

        } catch (FileNotFoundException exc){
            System.out.println("File not found");
        } catch (NoSuchFileException exc){
            System.out.println("File not found");
        } finally {
            if (bufferedReader != null){
                bufferedReader.close();
            }
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
        }
    }
}
