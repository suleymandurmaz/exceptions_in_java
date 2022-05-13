package day049.sekiller.usagefinally;

public class LenghtException extends Exception{
    public LenghtException(String message){
        super(message);
    }
    public LenghtException(){
        this("Lenght must be a positive number");

    }
}
