package day048;

import javax.swing.*;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        try {
            int sayi = Integer.parseInt(JOptionPane.showInputDialog("Bir sayı giriniz:"));
            int result = 500 / sayi;
            int[] sayilar=new int[5];
            Object obj=new Scanner(System.in);
            System.out.println((String) obj);
            System.out.println(sayilar[result]);
            System.out.println("Result = " + result);
        }catch (NumberFormatException ex){
            System.err.println(ex.getMessage());
        }catch (ArithmeticException hata){
            System.err.println(hata.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex.getMessage());
        }catch (ClassCastException ex){
            System.err.println(ex.getMessage());
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
