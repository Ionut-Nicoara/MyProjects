package isp.lab3.exercise4;

public class MyPoint {

    private int x;
    private int y;
    private int z;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public MyPoint(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z){

        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override

    public String toString(){
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double Distance(int x, int y, int z){

        int X = this.x - x;
        int Y = this.y - y;
        int Z = this.z - z;
        return Math.sqrt(X*X + Y*Y + Z*Z);
    }

    public double Distance(MyPoint another){

        int dx = this.x - another.getX();
        int dy = this.y - another.getY();
        int dz = this.z - another.getZ();
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }
}
