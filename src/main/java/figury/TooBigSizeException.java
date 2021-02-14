package figury;

public class TooBigSizeException extends Exception {
    @Override
    public String getMessage() {
        return "too big!";
    }
}
