package exercises1;

import java.util.Scanner;

public class IncomeTax {

//    Napisać program obliczający należny podatek dochodowy od osób fizycznych. Program
//      ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie
//      należny podatek. Podatek obliczany jest wg. następujących reguł:
//      • do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
//      • od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00

    public void calculateTax(){

        Scanner scanner = new Scanner(System.in);

        double income;
        double tax = 0;

            System.out.print("Podaj dochod: ");
            income = scanner.nextDouble();
            if (income<0){
                System.out.println("Income must be positive");
                return;
            } else if (income>=0 && income<85528){
                tax = (income*0.18)+556.02;
            } else {
                tax = ((income-85.528)*0.32)+14839.02;
            }
            System.out.print("Tax: ") ;
            System.out.format("%.2f",tax);
            System.out.println("PLN");
            System.out.println();
    }
}
