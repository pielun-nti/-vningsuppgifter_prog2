package tisdag09;

public class Rectangle {
    float length = 1.0f;
    float width = 1.0f;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(){

    }

    public double getArea(){
        return this.width*this.length;
    }

    public double getPerimeter(){
        return 4*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
