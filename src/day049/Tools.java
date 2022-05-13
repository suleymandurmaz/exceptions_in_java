package day049;

public class Tools {

    public static String convertToString(char[] values){
        String str="";
        try {
            for (int i = 0; i < values.length; i++) {
                str+=values[i];
            }
        }catch (NullPointerException | ArrayIndexOutOfBoundsException ex){
            System.err.println("Bir hata oluştu.");
        }

        return str;
    }

    public static String convertToString(int[] values){
        String str="";
        try {
            for (int i = 0; i < values.length; i++) {
                str+=values[i];
            }
        }catch (NullPointerException ex){
            System.err.println(ex.getMessage());
        }

        return str;
    }
    //0123456
    //MERHABA
    public static String reverse(String value) throws Exception {
        if (value==null) throw new Exception("Value değeri null olamaz.");
        String str="";
        for (int i = value.length()-1; i>=0 ; i--) {
            str+=value.charAt(i);
        }
        return str;
    }

    }