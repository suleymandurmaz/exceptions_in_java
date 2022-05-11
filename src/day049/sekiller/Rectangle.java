package day049.sekiller;

public class Rectangle {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) throws LengthException {
        if (height<=0) throw new LengthException();
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) throws LengthException {
        if (width<=0) throw new LengthException();
        this.width = width;
    }
}
