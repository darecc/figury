package figury;

public class TooSmallSizeException extends Exception {
    double size1;
    double size2;
    String name;
    private int count;
    public TooSmallSizeException(String name, double size) {
        this.name = name;
        this.size1 = size;
        count = 1;
    }
    public TooSmallSizeException(String name, double size1, double size2) {
        this.name = name;
        this.size1 = size1;
        this.size2 = size2;
        count = 2;
    }
    @Override
    public String getMessage() {
        if (count == 1)
            return "Size " + size1 + " is wrong for " + name + " !";
        else
            return "Size " + size1 + " + " + size2 + " are wrong for " + name + " !";
    }
}
