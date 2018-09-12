package exercises1;

import java.util.Scanner;

public class Exercises1 {

    //    Zajęcia 1 – typy danych, obsługa IO, instrukcje warunkowe

    public void exercises1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz program");
        printMenu();
        System.out.print("Twoj wybor to: ");

        boolean trueFalse = true;

        while (trueFalse){
            switch (scanner.nextInt()) {
                case 0:
                    System.out.println("Menu");
                    printMenu();
                    break;
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
                            "Calculate exercises1.BMI \n" +
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
                case -1:
                    System.out.println("Quit program");
                    trueFalse = false;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("0 - Menu \n" +
                "1 - Converter Celsius to Fahrenheit \n" +
                "2 - The highest and lowest value \n" +
                "3 - Calculate exercises1.BMI \n" +
                "4 - Calculate income tax \n" +
                "5 - Shopping in installments \n" +
                "6 - Calculator \n" +
                "-1 - Quit program");
    }
}
