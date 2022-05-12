package day050;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kaydedilmesini isteğiniz metni girip [enter] tuşuna basınız..");
        String metin=input.nextLine();
        try {
            FileWriter fw=new FileWriter("files/metin.txt",true);
            fw.write(metin+"\n");
            fw.close();
            System.out.println("Veri başarıyla kaydedildi.");
        } catch (IOException e) {
            System.out.println("Bir hata oluştu.");
        }
    }
}
