package day049.sekiller.usagefinally;

import java.io.File;

public class Main1 {
    public static void main(String[] args) {
        String fileName="files/metin2.txt";
        System.out.println("Aradığınız dosya : "+fileName);
        File f=new File(fileName);
        if (f.exists()){
            System.out.println("Dosya mevcut.");
            System.out.println("Dosya adı: "+f.getName());
            System.out.println("Parent: "+f.getParent());
            System.out.println("Path : "+f.getAbsolutePath());
        }else{
            System.out.println("Böyle bir dosya yok.");
        }
    }
}
