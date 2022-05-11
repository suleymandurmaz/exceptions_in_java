package day048;

public class Main5 {
    public static void main(String[] args) {

        String value="Deneme";
        String str="";
        for (int i = value.length()-1; i>=0; i--) {
            str+=value.charAt(i);
        }




        try {
            String isim=null;
            System.out.println(isim.length());
            System.out.println(5/0);
        }catch (Exception ex){
            if (ex instanceof ArithmeticException){
                System.err.println("Aritmetik hata");
            }else if (ex instanceof NullPointerException){
                System.err.println("Null pointer hatası.");
            }
        }
    }
}
