package exercises4;

import java.util.Scanner;

public class Exercises4 {

//    Zajęcia 4 – łańcuchy znaków (String)

    public void exercises4(){
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
                            "String exercise \n" +
                            "");
                    StringExercise program1 = new StringExercise();
                    program1.exerciseString();
                    break;
                case 2:
                    System.out.println("\n" +
                            "String exercise 2 \n" +
                            "");
                    StringExercise2 program2 = new StringExercise2();
                    program2.exerciseString();
                    break;
                case 3:
                    System.out.println("\n" +
                            "Palindrome \n" +
                            "");
                    Palindrome program3 = new Palindrome();
                    program3.palindrome();
                    break;
                case 4:
                    System.out.println("\n" +
                            "String exercise 4 \n" +
                            "");
                    StringExercise4 program4 = new StringExercise4();
                    program4.exerciseString();
                    break;
                case 5:
                    System.out.println("\n" +
                            "Check the brackets \n" +
                            "");
                    CheckingTheBrackets program5 = new CheckingTheBrackets();
                    program5.checkTheBrackets();
                    break;
                case 6:
                    System.out.println("\n" +
                            "Tekst encryption \n" +
                            "");
                    TextEncryption program6 = new TextEncryption();
                    program6.encryptionText();
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
                "1 - String exercise \n" +
                "2 - String exercise 2 \n" +
                "3 - Palindrome \n" +
                "4 - String exercise 4 \n" +
                "5 - Check the brackets \n" +
                "6 - Text encryption \n" +
                "100 - Close program");
    }
}
