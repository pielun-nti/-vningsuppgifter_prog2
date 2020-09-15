package mån1409;

import mån1409.MyPoint;
import mån1409.MyTriangle;

public class TestMyTriangle {
    public static void main(String[] args){
        MyTriangle triangle = new MyTriangle(1,1,2,2,3,3);
        System.out.println(triangle.v1.getX());
        System.out.println(triangle.v1.getY());
        System.out.println(triangle.toString());
        System.out.println("Triangle 1 type: " + triangle.getType());
        System.out.println(triangle.getPerimeter());
        MyPoint myPoint1 = new MyPoint(8, 6);
        MyPoint myPoint2 = new MyPoint(13, 24);
        MyPoint myPoint3 = new MyPoint(74, 42);
        MyTriangle myTriangle2 = new MyTriangle(myPoint1, myPoint2, myPoint3);
        System.out.println(myTriangle2.toString());
        System.out.println("Triangle 2 type: " + myTriangle2.getType());
        System.out.println(myTriangle2.getPerimeter());
    }
}
