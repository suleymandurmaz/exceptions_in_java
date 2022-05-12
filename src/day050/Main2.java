package day050;

import java.io.File;

public class Main2 {
    public static void main(String[] args) {
        File f=new File("files/metin.txt");
        dosyaSil(f);
    }

    public static void dosyaSil(File dosya){
        try {
            if (dosya.exists()){
                if (dosya.delete()){
                    System.out.println("Silindi.");
                }
            }
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

    }
}
