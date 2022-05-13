package day049.sekiller;

import day049.Tools;

public class Tools1 {
    public static String convertToString(char[] values) {
        String str = "";
        try {

            for (int i = 0; i < values.length; i++) {
                str += values[i];  //str = str + values[i+1];

            }


        } catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {

            System.err.println("bir hata daha olustu");


        }
        return str;
    }

    public static String convertToString(int[] values) {
        String str = "";
        for (int i = 0; i < values.length; i++) {
            str += values[i];

        }

        return str;
    }

    public static String reverse(String value) throws Exception {
        if (value==null)  throw new Exception("valu degeri null olamaz");
        String str = "";

            for (int i = value.length() - 1; i >= 0; i--) {
                str += value.charAt(i);


            }

            return str;
        }
        }


