package day048;

public class Main7 {
    public static void main(String[] args) {
        try {
            System.out.println(Main7.bol(5,5));
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

    }

    public static int bol(int x,int y) throws Exception {
        if(y==0) throw new Exception("İşlem hatası");
        return x/y;
    }
}
