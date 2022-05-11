package day049;


public class MainApp {
    //private static char[] dizi;
    public static void main(String[] args) {
        char[] dizi={'M','E','R','H','A','B','A'};
        String mesaj=Tools.convertToString(dizi);
        System.out.println(mesaj);

        int[] sayilar={1,5,7,2,4,6};
        mesaj=Tools.convertToString(sayilar);
        System.out.println(mesaj);

        try {
            System.out.println(Tools.reverse("MERHABA"));
            System.out.println(Tools.reverse(""));
            System.out.println(Tools.reverse(null));
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }



    }
}
