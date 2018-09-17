package exercises1;

import java.util.Scanner;

public class Exercises1 {

    //    Zajęcia 1 – typy danych, obsługa IO, instrukcje warunkowe

    public void exercises1() {

        Scanner scanner = new Scanner(System.in);

        boolean trueFalse = true;

        while (trueFalse){
            System.out.println();
            System.out.println("Wybierz program z listy");
            printMenu();
            System.out.print("Twoj wybor to: ");
            switch (scanner.nextInt()) {
                case 0:
                    System.out.println("Back to previus Menu");
                    return;
                case 1:
                    System.out.println("\n" +
                            "Converter Celsius to Fahrenheit \n" +
                            "");
                    ConverterCelsiusToFahrenheit program1 = new ConverterCelsiusToFahrenheit();
                    program1.convert();
                    break;
                case 2:
                    System.out.println("\n" +
                            "Show the highest and lowest value \n" +
                            "");
                    TheHighestAndLowestValue program2 = new TheHighestAndLowestValue();
                    program2.showValue();
                    break;
                case 3:
                    System.out.println("\n" +
                            "Calculate BMI \n" +
                            "");
                    BMI program3 = new BMI();
                    program3.calculateBMI();
                    break;
                case 4:
                    System.out.println("\n" +
                            "Calculate income tax \n" +
                            "");
                    IncomeTax program4 = new IncomeTax();
                    program4.calculateTax();
                    break;
                case 5:
                    System.out.println("\n" +
                            "Calculate installments \n" +
                            "");
                    ShoppingInInstallments program5 = new ShoppingInInstallments();
                    program5.calculateInstallments();
                    break;
                case 6:
                    System.out.println("\n" +
                            "Calculator \n" +
                            "");
                    Calculator program6 = new Calculator();
                    program6.calculate();
                    break;
                case 100:
                    System.out.println("Close program");
                    trueFalse = false;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("0 - Back to previus Menu \n" +
                "1 - Converter Celsius to Fahrenheit \n" +
                "2 - The highest and lowest value \n" +
                "3 - Calculate BMI \n" +
                "4 - Calculate income tax \n" +
                "5 - Shopping in installments \n" +
                "6 - Calculator \n" +
                "100 - Close program");
    }
}
