package day047;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        //checked Exception
        try {
            //Eğer dosyanın fullpath'i yazılmamış ise
            //programın çalıştığı klasör fullpath kabul edilir.
            FileReader dosya=new FileReader("deneme.txt");
            char[] dizi=new char[64];
            int okunan=dosya.read(dizi);
            for (int i = 0; i <= dizi.length; i++) {
                System.out.print(dizi[i]);
            }
            System.out.println();

        }
        catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){

        }

        System.out.println("Program normal sonlandı.");
    }
}
