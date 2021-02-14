package company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class KolekcjaZnajomych<Osoba> implements Iterable<Osoba> {
    private List<Osoba> lista;
    public KolekcjaZnajomych() {
        this.lista = new ArrayList<Osoba>();
    }
    public KolekcjaZnajomych(List<Osoba> lista) {
        this.lista = new ArrayList<Osoba>();
        /**
         * przekazywany parametr nie jest typu ArrayList<Osoba> wiec dodajemy Osoby w petli for
         */
        for(Osoba osoba : lista)
            this.lista.add(osoba);
    }
    public void add(Osoba osoba) {
        this.lista.add(osoba);
    }
    public Iterator<Osoba> iterator() {
            Iterator<Osoba> it = new Iterator<Osoba>() {
            private int currentIndex = 0;
            public boolean hasNext() {
                return currentIndex < lista.size();
            }
            public Osoba next() {
                return lista.get(currentIndex++);
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
