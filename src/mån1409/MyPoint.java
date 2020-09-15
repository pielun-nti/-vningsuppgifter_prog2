package mån1409;

public class MyPoint {
    int x;
    int y;
    public MyPoint(){

    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getXY(){
        int [] th = {x, y};
        return th;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

   public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x-another.x;
        int yDiff = this.y-another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(){
        int xDiff = this.x;
        int yDiff = this.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }


    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
