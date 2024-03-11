package isp.lab3.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(1,2);
        Rectangle R2 = new Rectangle();
        Rectangle R3 = new Rectangle(2,3,"blue");

        System.out.println(R1.getArea());
        System.out.println(R2.getPerimeter());
        System.out.println(R3.getWidth());
        System.out.println(R2.getColor());
        System.out.println(R1.getLength());
    }
}
