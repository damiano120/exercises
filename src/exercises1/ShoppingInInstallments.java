package exercises1;

import java.util.Scanner;

public class ShoppingInInstallments {

//W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program
//umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt. Danymi
//wejściowymi dla programu są:
//• cena towaru (od 100 zł do 10 tyś. zł),
//• liczba rat (od 6 do 48).
//Kredyt jest oprocentowany w zależności od liczby rat:
//• od 6–12 wynosi 2.5% ,
//• od 13–24 wynosi 5%,
//• od 25–48 wynosi 10%.
//Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien
//sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w
//przypadku błędu pytać prosić użytkownika ponownie o podanie danych.

    public void calculateInstallments(){

        Scanner scanner = new Scanner(System.in);

        double price;
        int numberInstallments;
        double installment;

            System.out.print("Podaj cene towaru z zakresu od 100zl do 10 tys.zl: ");
            price = scanner.nextDouble();
            if (price < 100 || price > 10000) {
                System.out.println("Nieprawidłowa kwota. Podaj kwotę z zakresu od 100zl do 10 tys.zl");
                return;
            }
            System.out.print("Podaj ilosc rat od 6 do 48: ");
            numberInstallments = scanner.nextInt();
            if (numberInstallments<6 || numberInstallments>48){
                System.out.println("Nieprawidlowa ilosc rat. Podaj ilosc rat z zakresu od 6 do 48");
                return;
            }
            if (numberInstallments>=6 && numberInstallments<=12){
                installment = (price/numberInstallments)+((price*0.025)/numberInstallments);
            } else if (numberInstallments>=13 && numberInstallments<=24){
                installment = (price/numberInstallments)+((price*0.05)/numberInstallments);
            } else {
                installment = (price/numberInstallments)+((price*0.1)/numberInstallments);
            }
            System.out.print("Rata wyniesie ");
            System.out.format("%.2f%n",installment);
            System.out.println();
    }
}
