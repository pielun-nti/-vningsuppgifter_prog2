package mån1409;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public double getPerimeter(){
        double dist = v1.distance();
        double dist2 = v1.distance(v2);
        double dist3 = v2.distance(v3);
        return dist + dist2 + dist3;
    }

    public String getType(){
        double dist = v1.distance();
        double dist2 = v1.distance(v2);
        double dist3 = v2.distance(v3);
        if (dist == dist2 & dist2 == dist3 & dist == dist3){
            return "equilateral";
        } else if (dist == dist2 || dist2 == dist3 || dist3 == dist){
            return "isosceles";
        }
        return "scalene";
    }

    @Override
    public String toString() {
        return "MyTriangle{v1=(" + v1.getX() + "," + v1.getY() + "),v2=("+ v2.getX() + "," + v2.getY() + "),v3=(" + v3.getX() + "," + v3.getY() + ")}";
    }
}
