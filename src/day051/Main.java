package day051;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            int x=7;
            int y=0;
            System.out.println("Sonuç = "+(x/y));
        }catch (ArithmeticException hata){
            System.out.println(hata.getMessage());
        }

    }
}
