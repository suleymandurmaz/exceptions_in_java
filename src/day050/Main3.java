package day050;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("files/exceptions-keywords.txt")){
            byte[] data = fis.readAllBytes();
            for(byte b:data){
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
