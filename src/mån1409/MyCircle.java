package mån1409;

public class MyCircle {
    MyPoint center = new MyPoint(0,0);
    int radius;

    public MyCircle(){
        center = new MyPoint(0, 0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius){
        this.radius = radius;
        center = new MyPoint(x, y);
    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        int radius = (getRadius()/2)^2;
        return 3.14*radius;
    }




    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public double distance(MyCircle another){
        return center.distance(another.center);
    }


}
