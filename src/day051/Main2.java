package day051;

public class Main2 {
    public static void main(String[] args) {
        int[] sayilar={4,5,2,1};
        try {
            System.out.println(sayilar[5]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

    }
}
