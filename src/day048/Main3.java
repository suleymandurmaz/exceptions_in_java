package day048;

import javax.swing.*;

public class Main3 {
    public static void main(String[] args) {
        String isim=JOptionPane.showInputDialog("İsminiz nedir?");
        if (isim!=null&&isim.isEmpty()) {
            System.out.println(isim);
        }




    }
}
