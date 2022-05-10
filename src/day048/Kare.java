package day048;


//Main8
public class Kare {
    private int kenar;

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) throws Exception {
        if (kenar<=0) throw new KareKenarException("Karenin kenarı sıfırdan büyük olmalıdır.");
        this.kenar = kenar;
    }

    public int alanHesapla(){
        return kenar*kenar;
    }
}
