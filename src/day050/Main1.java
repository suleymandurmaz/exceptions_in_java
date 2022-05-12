package day050;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Metin girişi:");
        String metin= input.nextLine();
        try(FileWriter fw=new FileWriter("files/metin1.txt",true)) {
            fw.write(metin);
            System.out.println("Kaydedildi.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }




}
