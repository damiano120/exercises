package exercises1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverterCelsiusToFahrenheit {

//    Napisać program służący do konwersji wartości temperatury podanej w stopniach
//      Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
//      Celsjusza + 32.0)

    public void convert(){

        double degreesCelsius;
        double degreesFahrenheit;

        Scanner scanner = new Scanner(System.in);

            System.out.print("Wpisz wartość w stopniach Celcjusza: ");
            degreesCelsius = scanner.nextDouble();
            degreesFahrenheit = ((degreesCelsius * 1.8)+32);
            System.out.print(degreesCelsius+" stopni Celsjusza to ");
            System.out.format("%.2f",degreesFahrenheit);
            System.out.println(" stopni Fahrenheita.");
            System.out.println();
    }
}
