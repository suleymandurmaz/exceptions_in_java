package day048;

public class Main {
    public static void main(String[] args) {
        int x=5;
        int y=0;
        int z;
        try {
            z=x/y;
            System.out.println("Sonuç = "+z);
        }catch (ArithmeticException ex){
            System.err.println("Bir hata oluştu. Hata: "+ex.getMessage());
        }





    }
}
