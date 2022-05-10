package day048;

import javax.swing.*;

public class Main4 {
    public static void main(String[] args) {
        String isim= JOptionPane.showInputDialog("İsminiz nedir?");
        try {

            System.out.println("İsminiz "+isim.length()+" harften oluşmaktadır.");
        }catch (NullPointerException ex){
            System.err.println(ex.getMessage());
        }


    }
}
