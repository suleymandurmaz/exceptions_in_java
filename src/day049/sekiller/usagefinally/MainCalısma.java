package day049.sekiller.usagefinally;

import day049.Tools;

public class MainCalısma {
   // private static char[] dizi;
    public static void main(String[] args) throws Exception {
        char[] dizi={'m','e','r','h','a','b','a' };
        String mesaj= Tools.convertToString(dizi);
        System.out.println(mesaj);
        int[] sayılar=null;//{1,2,3,4,5,6};
        mesaj=Tools.convertToString(sayılar);
        System.out.println(mesaj);

        try {
            System.out.println(Tools.reverse("merhaba"));
            System.out.println(Tools.reverse(""));
            System.out.println(Tools.reverse (null));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    }

