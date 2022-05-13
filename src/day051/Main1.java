package day051;

public class Main1 {

    public static void main(String[] args) {
        String isim=null;
        try {
            for (int i = 0; i <isim.length() ; i++) {
                System.out.println(isim.charAt(i));
            }
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }

    }
}
