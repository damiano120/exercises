//  Napisać program służący do konwersji wartości temperatury podanej w stopniach
//  Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
//  Celsjusza + 32.0)

package exercise1;

import java.util.Scanner;

public class ConversionCelsiusToFahrenheit {

    public void conversionCelciusToFahrenheit(){

        Scanner scanner = new Scanner(System.in);

        double degreesCelsius;
        double degreesFahrenheit;
        boolean trueFalse = true;

        while (trueFalse){
            degreesFahrenheit = ((degreesCelsius * 1.8)+32);
            System.out.format("%.1f%n",degreesFahrenheit);
            System.out.println(degreesCelsius+" stopni Celsjusza to "+ degreesFahrenheit + " stopni Fahrenheita.");
        }
    }
}
