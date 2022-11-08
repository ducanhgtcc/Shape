package Shape;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    public static class SquareTest {
        public static void main(String[] args) {
            Square square = new Square(10, "pink", false);
            System.out.println(square.toString());
            System.out.println("A Square with side = " + square.getSide());
            System.out.println("The area is " + square.getArea());
            System.out.println("The diameter is " + square.getPerimeter());
        }
    }
}
