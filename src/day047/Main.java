package day047;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args)  {
        //checked Exception
        try {
            FileReader dosya=new FileReader("denem_e");
        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }

        System.out.println("Program normal sonlandı.");

    }
}
