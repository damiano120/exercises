package exercises1;

import java.util.Scanner;

public class BMI {

//    Napisać program, który oblicza wartość współczynnika exercises1.BMI (ang. body mass
//      index) wg. wzoru: waga/(wzrost^2).
//      Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje
//      ”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.

    public void calculateBMI(){

        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double bmi;
        boolean trueFalse = true;

        while (trueFalse){
            System.out.print("Podaj swoją wagę: ");
            weight = scanner.nextDouble();
            System.out.print("Podaj swój wzrost: ");
            height = scanner.nextDouble();
            if (height>3){
                height /=100;
            }
            bmi = weight/(Math.pow(height, 2));
            System.out.println("Twoje exercises1.BMI to " +bmi);
            if (bmi<18.5){
                System.out.println("Masz niedowage");
            } else if (bmi>=18.5 && bmi <= 24.9){
                System.out.println("Twoja waga jest prawidlowa");
            } else {
                System.out.println("Masz nadwage");
            }
            System.out.println();
        }

    }
}
