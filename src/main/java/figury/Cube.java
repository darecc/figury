package figury;

public class Cube extends Square implements IFigura3d {
    public Cube(double side) {
        super("cube", side);
    }
    @Override
    public double getArea() {
        return super.getArea()*6;
    }

    public double getVolume() {
        double vol = super.getArea() * super.getSide();
        return vol;
    }
    public String showVolume() {

        return "Volume(" + getName() + ") = " + getVolume();
    }
    @Override
    public String toString() {
        return "Cube: " + getVolume();
    }
}
