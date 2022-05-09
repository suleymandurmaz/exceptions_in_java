package day047;

public class Main2 {
    public static void main(String[] args) {
        //Task: unchecked Exception kullanımı
        /*
            Bir String dizisi oluşturunuz. (String[])
            Beş elemanlı olan bu dizinin 5. indeksine erişiniz
            Programın kırıldığını görünüz.
            Erişim kodunun olduğu bölümü try - catch blokuna alıp hatayı yönetiniz.
         */
        String[] gunler={"Pzt","Sal","Çar","Per","Cum","Cts","Paz"};
        try {
            for (int i = 0; i <= gunler.length ; i++) {
                System.out.println(gunler[i]);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Program sonlandı.");
    }
}
