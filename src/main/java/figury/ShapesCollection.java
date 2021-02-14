package figury;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Klasa ShapesCollection zawiera liste figur geom. i wlasna klase iteratora
 * @param <Shape>
 */
public class ShapesCollection<Shape> implements Iterable<Shape> {
    private List<Shape> shapeList;
    public void add(Shape shape) {
        shapeList.add(shape);
    }

    /**
     * Konstruktor klasy ShapesCollection inicjuje liste figur
     */
    public ShapesCollection() {
        shapeList = new ArrayList<Shape>();
    }
    /**
     * Zwrocenie instancji iteratora
     * @return
     */
    public Iterator<Shape> iterator()
    {
        return new ShapeIterator<Shape>(this.shapeList);
    }
}
