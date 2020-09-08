package tisdag09;

public class TestRectangle {
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle();
        rec1.setLength(6);
        rec1.setWidth(7);
        System.out.println("The rectangle has a area of " + rec1.getArea() + " and perimeter: " + rec1.getPerimeter()
                + "\r\nand length: " + rec1.getLength() + " and width: " + rec1.getWidth() + " and tostring: " + rec1.toString());
    }
}
