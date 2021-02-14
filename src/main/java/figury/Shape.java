package figury;

public abstract class Shape {
    public String getName() {
        return name;
    }

    private String name;
    public Shape() {
        name = "shape";
    }
    public Shape(String name) {
        this.name = name;
    }
    public abstract double getArea();

    public void showArea() {
        System.out.println("Area (" + name + ")= " + String.format("%.3f", this.getArea()));
    }

    @Override
    public String toString() {
        return name;
    }

    public String getClassName() {
        String nazwa = this.getClass().getName();
        nazwa = nazwa.substring(nazwa.indexOf(".")+1);
        return nazwa;
    }
}
