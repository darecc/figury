package figury;

public class Rectangle extends Shape {
    private double side1;
    private double side2;
    public Rectangle(double side1, double side2) throws TooSmallSizeException {
        super("rectangle");
        if (side1 <=0 || side2 <=0) throw new TooSmallSizeException(getName(), side1, side2);
        this.side1 = side1;
        this.side2 = side2;
    }
    public double getArea() {
        return side1 * side2;
    }
}
