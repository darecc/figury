package figury;

public class Square extends Shape{
    final static double MAXSIZE = 100;
    private double side;
    public Square() {}
    public Square(double side) throws TooSmallSizeException, TooBigSizeException {
        super("square");
        if (side <= 0)
            throw new TooSmallSizeException(getName(), side);
        if (side > MAXSIZE)
            throw  new TooBigSizeException();
        this.side = side;
    }
    public Square(String name, double side) {
        super(name);
        this.side = side;
    }
    public double getArea() {
        return side*side;
    }

    public double getSide() {
        return side;
    }
}
