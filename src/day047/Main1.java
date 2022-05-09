package day047;

public class Main1 {
    public static void main(String[] args) {
        //unchecked Exception
        int[] sayilar={1,3,5,2};
        try {
            System.out.println(sayilar[5]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex.getMessage());
        }



        System.out.println("Program normal sonlandı.");
    }
}
