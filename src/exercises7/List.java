package exercises7;

/*
Zad. Lista
Napisać klasę Lista , której zadaniem będzie przechowywanie listy liczb całkowitych.
Klasa ta ma mieć następujące pola prywatne:
• int [] liczby; – tablica, w której przechowywane będą liczby,
• int pojemnosc; – maksymalna liczba elementów, możliwych do przechowywania,
• int rozmiar; – aktualna liczba przechowywanych elementów.
Klasa Lista powinna mieć również następujące metody:
• konstruktor z parametrem określającym pojemność, który przydziela pamięć dla
tablicy liczby oraz ustala wartości pozostałych pól klasy;
• metodę dodajElement , która przyjmuje dokładnie jeden element – liczbę całkowitą,
która dodawana jest do listy; w przypadku, gdy lista jest pełna powinien
zostać wyświetlony komunikat o błędzie;
• metodę znajdz , której jedynym parametrem powinna być szukana liczba, natomiast
wynikiem pozycja podanej liczby w liście (licząc od 0) lub -1, gdy liczby
nie ma na liście;
• bezparametrową metodę pisz , która wypisuje informacje o liście, w tym jej
rozmiar, pojemność oraz listę przechowywanych elementów;
• metodę usunPierwszy , która usuwa pierwsze wystąpienie podanej jako parametr
liczby, jeżeli znajduje się ona na liście, tzn. jeżeli podana liczba występuje więcej
niż jeden raz, to usuwane jest jedynie pierwsze jej wystąpienie;
• metodę usunPowtorzenia , która usuwa wszystkie powtórzenia elementów na
liście, tzn. po jej wykonaniu na liście nie powinno być żadnych powtórzonych
liczb;
• metodę odwroc , która odwraca kolejność elementów przechowywanych na liście;
• metodę zapiszDoPliku , która zapisuje zawartość listy do pliku tekstowego, którego
nazwa podana powinna być jako pierwszy parametr;
Przykładowo, po wykonaniu poniższego fragmentu:
final int N = 10;
Lista l = new Lista(N);
for (int i = 0; i < N/2; ++i) {
l.dodajElement( (1 << i) );
}
l.dodajElement(2);
l.dodajElement(8);
l.pisz();
l.usunPierwszy(2);
l.pisz();
for (int i = 0; i < N/2; ++i) {
l.dodajElement( (1 << i) );
}
l.pisz();
System.out.println("Po usunięciu powtórzeń:");
l.usunPowtorzenia();
l.pisz();
Na ekranie powinno zostać wyświetlone:
Lista:
Pojemność: 10
Rozmiar: 7
Elementy: 1 2 4 8 16 2 8
Lista:
Pojemność: 10
Rozmiar: 6
Elementy: 1 4 8 16 2 8
Nie można dodać więcej elementów, lista pełna!
Lista:
Pojemność: 10
Rozmiar: 10
Elementy: 1 4 8 16 2 8 1 2 4 8
Po usunięciu powtórzeń:
Lista:
Pojemność: 10
Rozmiar: 5
Elementy: 1 16 2 4 8
 */

public class List {

    public void list(){

        final int n = 10;
        Lst list1 = new Lst(n);
        for (int i = 0; i < n/2; ++i) {
            list1.addNumber( (1 << i) );
        }
        list1.addNumber(2);
        list1.addNumber(8);
        list1.print();
        list1.removeFirst(2);
        list1.print();
        for (int i = 0; i < n/2; ++i) {
            list1.addNumber( (1 << i) );
        }
        list1.print();
        System.out.println("Po usunieciu powtorzen: ");
        list1.removeRepeat();
        list1.print();
    }
}
