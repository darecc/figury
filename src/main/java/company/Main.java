package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static ArrayList<Osoba> listaOsob = new ArrayList<Osoba>();
    public static void main(String[] args) {
	// osoby ...
     Osoba osoba1 = new Osoba("Jan", "Kowalski", "1980-11-02", new Adres("Poznań", "ul. Szklista 12", "60-111"));
     Osoba osoba2 = new Osoba("Anna", "Zamojska", "1988-03-02");
     Osoba osoba3 = new Osoba("Janina", "Kot", "1988-04-02");
     Osoba osoba4 = new Osoba("Antoni", "Robak", "1995-12-02");
     Osoba osoba5 = new Osoba("Eliza", "Kobek", "1999-11-17");
     Osoba osoba6 = new Osoba("Helena", "Tymecka", "1992-03-10");
     listaOsob.add(osoba1);
     listaOsob.add(osoba2);
     listaOsob.add(osoba3);
     listaOsob.add(osoba4);
     listaOsob.add(osoba5);
     listaOsob.add(osoba6);
     System.out.println(osoba1.getImię());
     boolean czyUdałoSię = osoba1.setNazwisko("Mickiewcz!");
      if (!czyUdałoSię)
          System.out.println("Nie udało się zmienić nazwiska");
     for(Osoba osX : listaOsob)
        System.out.println(osX.toString());
     for(int i = 0; i < listaOsob.size(); i++)
         System.out.println(listaOsob.get(i).toString());
     String napis = "123.4";
     double dx = Double.parseDouble(napis);
     double fx = 2* dx;
     KolekcjaZnajomych<Osoba> znajomi = new KolekcjaZnajomych<Osoba>(Arrays.asList(osoba2, osoba2,osoba3,osoba4, osoba5));
     znajomi.add(osoba6);
     System.out.println("=== Kolekcja osób: ===");
     Iterator<Osoba> iterator = znajomi.iterator();
     while(iterator.hasNext()) {
         Osoba osoba = iterator.next();
         System.out.println(osoba);
     }
    }
}
