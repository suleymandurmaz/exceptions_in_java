package day049.sekiller.usagefinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        String fileName="files/metin2.txt";
        FileReader fr=null;
        try {
            fr=new FileReader(fileName);
            char[] buf=new char[1024];
            int okunan=fr.read(buf);
            for (int i = 0; i < okunan; i++) {
                System.out.print(buf[i]);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Hata oluştu. Hata: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Hata oluştu. Hata: "+e.getMessage());
        }finally {
            try {
                System.out.println("Dosya kapatılıyor.");
                fr.close();
                System.out.println("Dosya kapatıldı.");
            } catch (IOException e) {
                System.out.println("Dosya kapanırken hata oluştu. Hata: "+e.getMessage());
            }
        }
    }
}
