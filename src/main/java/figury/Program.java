package figury;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
            ArrayList<Shape>  figury = new ArrayList<Shape>();
            Circle ci1 = new Circle(5.6);
            Cylinder cyl1 = new Cylinder(12.0, 10.2);
            Cube cu1 = new Cube(7.1);
            try {
                Rectangle re1 = new Rectangle(6.4, -7.8);
                Square sq1 = new Square(3.5);
                System.out.println("Klasa=" + sq1.getClassName());
                Square sq2 = new Square(0.0);
                Square sq3 = new Square(-2.6);
                Square sq4 = new Square(10000);
                figury.add(re1);
                figury.add(sq1);
            }
            catch(TooSmallSizeException ex) {
                System.out.println(ex.getMessage());
            }
            catch(TooBigSizeException ex) {
                System.out.println(ex.getMessage());
            }
        figury.add(ci1);
        figury.add(cyl1);
        figury.add(cu1);
        for(Shape figura : figury)
            figura.showArea();

        System.out.println("==== wywołanie metody showArea() dla obiektów należących do Shape ===");
        ArrayList lista = new ArrayList();
        lista.add(ci1);
        lista.add(121);
        lista.add("aaaa");
        for(Object ob : lista) {
            if (ob instanceof Shape) {
                Shape sh = (Shape) ob;
                sh.showArea();
            }
        }
        System.out.println("=== VOLUMES ===");
        for(Shape figura : figury) {
            if (figura instanceof IFigura3d) {
                IFigura3d fig = (IFigura3d) figura;
                System.out.println(fig.showVolume());
            }
        }
        // należy dopisać klasę:  Cuboid (prostopadłościan)
        // iterator dla klasy ShapeCollection
        System.out.println("=== KOLEKCJA FIGUR ===");
        ShapesCollection<Shape> collection = new ShapesCollection<Shape>();
        collection.add(ci1);
        Gson json = new GsonBuilder().create();
        String napis = json.toJson(collection);
        System.out.println(napis);
        // var = ? taka pokusa :)
        ShapesCollection coll = json.fromJson(napis, ShapesCollection.class);
        for(Shape sh : collection)
            System.out.println(sh.toString());
        Iterator iter = coll.iterator();
        while(iter.hasNext())
            System.out.println(iter.next().toString());
    }
}
