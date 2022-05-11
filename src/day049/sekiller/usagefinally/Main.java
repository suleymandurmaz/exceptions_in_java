package day049.sekiller.usagefinally;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Kod denenir.");
            int x=7/0;
            System.out.println("Sonuç = "+x);
        }catch (Exception ex){
            System.out.println("Hatalı durum oluştu.");
        }finally {
            System.out.println("Buradaki kod hata oluşsa da oluşmasa da çalışır.");
        }
        System.out.println("try bloku dışı.");
    }
}
