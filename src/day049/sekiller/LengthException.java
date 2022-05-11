package day049.sekiller;

public class LengthException extends Exception{
    public LengthException() {
        super("Length must be a positive number.");
    }
}
