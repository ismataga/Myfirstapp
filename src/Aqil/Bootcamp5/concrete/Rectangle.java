package Aqil.Bootcamp5.concrete;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getArea() {
        return length * width;
    }
}
