package day049.sekiller.usagefinally;

public class Rectangle {
    private int hight;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int hight, int width) {
        this.hight = hight;
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public int getWidth() {
        return width;
    }

    public void setHight(int hight) throws LenghtException {
        if (hight <= 0) {
            throw new LenghtException("Length must be a posıtive number");
         //   this.hight = hight;
        }

        //public void setWidth( intnt width){
            this.width = width;
        }
    }

