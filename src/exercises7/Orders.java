package exercises7;

        /*
        Napisać program do obsługi zamówień. Program powinien składać się z dwóch
klas: Zamowienie oraz Pozycja , przy czym każde zamówienie zawierać może
jedną lub więcej pozycji.
Klasa Pozycja powinna zawierać następujące pola:
• nazwaTowaru (String)
• ileSztuk (int) – liczba zamówionych sztuk
• cena (double) – cena pojedynczej sztuki
oraz metody:
• konstruktor z parametrami umożliwiającymi ustalenie wartości pól klasy,
• metodę double obliczWartosc() zwracającą wartość pozycji zamówienia,
• metodę String toString() zwracającą łańcuch w formacie: nazwa towaru
(20 znaków), cena (10 znaków), liczba sztuk (4 znaki), wartość zamówienia
(10 znaków), przykład:
Cukier 4,00 zł 3 szt. 12,00 zł
Klasa Zamowienie powinna zawierać następujące pola:
• pozycje (tablica obiektów kl. Pozycja) – pozycje składowe zamówienia,
• ileDodanych (int) – liczba pozycji w zamówieniu,
• maksRozmiar (int) – maksymalna liczba pozycji w zamówieniu
oraz metody:
• konstruktor bezparametrowy – maksRozmiar ustalany na wartość 10,
• konstruktor z parametrem określającym maksymalną liczbę pozycji w zamówieniu,
• metodę void dodajPozycje(Pozycja p) , która dodaje podaną pozycję do
zamówienia,
• metodę double obliczWartosc() zwracającą wartość zamówienia,
• metodę String toString() , która zwraca łańcuch zawierający spis pozycji
zamówienia oraz łączną wartość zamówienia.
Przykładowa metoda korzystająca z wspomnianych klas:
public static void main(String [] args) throws IOException {
Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
System.out.println(p1);
Pozycja p2 = new Pozycja("Cukier", 3, 4);
System.out.print(p2);
Zamowienie z = new Zamowienie(20);
z.dodajPozycje(p1);
z.dodajPozycje(p2);
System.out.println(z);
}
Przykładowy wynik:
Chleb 3,50 zł 1 szt. 3,50 zł
Cukier 4,00 zł 3 szt. 12,00 zł
Zamówienie:
Chleb 3,50 zł 1 szt. 3,50 zł
Cukier 4,00 zł 3 szt. 12,00 zł
Razem: 15,50 zł
2. W klasie Zamowienie :
• zaimplementować metodę void usunPozycje(int indeks) , która usuwa
z zamówienia pozycję o podanym indeksie
• zaimplementować metodę void edytujPozycje(int indeks) , która umożliwi
edycję wybranej pozycji zamówienia, tj. nazwy towaru, ceny oraz liczby
sztuk
• zmodyfikować metodę void dodajPozycje(Pozycja p) , tak by w stytuacji,
gdy dodawany jest ten sam towar nie dodawała kolejnej pozycji, lecz
zwiększała liczbę sztuk w już istniejącej
3. W klasie Pozycja :
• zaimplementować metodę double obliczWartoscZRabatem , która oblicza
wartość pozycji zamówienia po uwzględnieniu rabatu zależnego od liczby
sztuk:
– 5–10 szt. rabat 5%,
– 10–20 szt. rabat 10
– powyżej 20 szt. rabat 15%.
4. Zmodyfikować metodę obliczWartosc w klasie Zamowienie, tak by również wyświetlała
informacje o rabacie i łączny koszt zamówienia po jego uwzględnieniu.
5. zmodyfikować metodę toString , by wyświetlała również naliczony rabat i wartość
z rabatem.
6. W obu klasach zaimplementować interfejs Serializable umożliwiający zapis i
odczyt danych z pliku realizowany przez metody:
• metodę public static void zapiszZamowienie(Zamowienie z, String nazwaPliku) ,
która zapisze podane w parametrze zamówienie do pliku o nazwie podanej
drugim parametrem.
• metodę public static Zamowienie wczytajZamowienie(String nazwaPliku) ,
która wczyta z pliku o podanej nazwie zamówienie i zwróci je jako wynik.

         */

import java.io.IOException;

public class Orders {
    public void orders() throws IOException  {

        Item item1 = new Item("Chleb", 1, 3.5);
        System.out.println(item1);
        Item item2 = new Item("Chleb", 3, 3.5);
        System.out.println(item2);
        Item item3 = new Item("Cukier", 8, 4);
        System.out.println(item3);
        Item item4 = new Item("Lizaki", 16, 1);
        System.out.println(item4);
        Item item5 = new Item("Lody", 24, 2);
        System.out.println(item5);
        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);
        order.addItem(item4);
        order.addItem(item5);
        System.out.println(order);
        String fileNameOut = "src\\exercises7\\program1OrderOut.txt";
        String fileNameIn = "src\\exercises7\\program1OrderIn.txt";
        order.saveOrder(order, fileNameOut);
        order.loadOrder(fileNameIn);
        System.out.println(order);

    }
}
