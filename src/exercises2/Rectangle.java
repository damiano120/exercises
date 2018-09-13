package exercises2;

import java.util.Scanner;

public class Rectangle {

//    Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekranie
//prostokąt. Użytkownik podaje znak wypełnienia prostokąta, pozycję lewego
//górnego rogu prostokąta (x, y) oraz długości boków prostokąta (ab). Przyjmujemy,
//że lewy górny narożnik konsoli ma współrzędne (x, y) = (1, 1).
//Przykład: x=6, y=3, a=4, b=6, zn=’x’
//>
//>
//> _____xxxxxx
//> _____xxxxxx
//> _____xxxxxx
//> _____xxxxxx
//ozn.
//> - nowa linia,
//_ - znak spacji.

    private int x = 0;
    private int y = 0;
    private int a = 0;
    private int b = 0;
    private String zn;

    public void drawRectangle(){

        getData();

//        SET Y
            for (int i=1; i<=y; i++) {
                System.out.println(">");
            }

        for (int i=1; i<=a; i++){
            for (int j=1; j<x; j++){
                System.out.print("_");
            }
            for (int k=1; k<=b; k++){
                System.out.print(zn);
            }
            System.out.println();
        }
    }

    public void getData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dane do narysowania kwadratu");
        System.out.println("Podaj pozycje lewego gornego rogu prostokata:");
        System.out.print("x = ");
        String tempX = scanner.nextLine();
        System.out.print("y = ");
        String tempY = scanner.nextLine();
        System.out.println("Podaj dlugosci bokow: ");
        System.out.print("a = ");
        String tempA = scanner.nextLine();
        System.out.print("b = ");
        String tempB = scanner.nextLine();
        System.out.println("Podaj znak do rysowania (preferowany 'x') ");
        System.out.print("Twoj znak: ");
        zn = scanner.nextLine();
        try {
            x = Integer.parseInt(tempX);
            y = Integer.parseInt(tempY);
            a = Integer.parseInt(tempA);
            b = Integer.parseInt(tempB);
        } catch (NumberFormatException exc){
            System.out.println("Nie podales cyfr. Podaj cyfry...");
            System.out.println();
            drawRectangle();
        }
        System.out.println();
    }
}
