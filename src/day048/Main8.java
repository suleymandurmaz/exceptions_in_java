package day048;

public class Main8 {
    public static void main(String[] args) {
        Kare k=new Kare();
        try {
            k.setKenar(5);
            System.out.println("Alan= "+k.alanHesapla());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
