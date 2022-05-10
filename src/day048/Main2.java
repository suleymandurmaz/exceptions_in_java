package day048;

public class Main2 {
    public static void main(String[] args) {
        String isim=null;
        try {
            System.out.println("İsminiz "+isim.length()+" harften oluşmaktadır.");
        }catch (NullPointerException ex){
            System.err.println("Bir hata oluştu. Hata: "+ex.getMessage());
        }
        System.out.println("Program düzgün sonlandı.");

    }
}
