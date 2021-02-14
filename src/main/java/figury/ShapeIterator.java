package figury;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Klasa ShapeIterator definiujaca itrator dla kolekcji (arraylist) obiektow klasy Shape
 * @param <Shape>
 */
public class ShapeIterator<Shape> implements Iterator<Shape> {
    List<Shape> shapeList;
    int current;
    /**
     * Zainicjowanie iteratora w konstruktorze
      */
    public ShapeIterator(List<Shape> list) {
        if (list.size() > 0) {
            current = 0;
            shapeList = list;
        }
        else {
            current = -1;
            shapeList = new ArrayList<Shape>();
        }
    }

    /**
     * Metoda hasNext zwraca true jesli kolejny element nie bedzie wiekszy niz rozmiarlisty shapeList
     * @return
     */
    public boolean hasNext() {
        if (shapeList.size() > current)
            return true;
        else
            return false;
    }

    /**
     * Metoda next zwraca aktualny obiekt Shape i przechodzi do nastepnego (bo istnieje)
     * @return
     */
    public Shape next()
    {
        Shape shape = shapeList.get(current);
        current++;
        return shape;
    }
    /**
     * Mozna zaimplementowac, ale niekoniecznie ;)
     */
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
