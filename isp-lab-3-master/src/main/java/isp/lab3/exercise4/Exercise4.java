package isp.lab3.exercise4;

public class Exercise4 {
    public static void main(String[] args) {

        MyPoint P1 = new MyPoint(4,3,2);
        MyPoint P2 = new MyPoint(3,2,1);
        System.out.println(P1.toString());
        System.out.println(P2.toString());

        //Distance method
        System.out.println(P1.Distance(1,2,3));

        //Overloaded distance method
        System.out.println(P1.Distance(P2));
    }
}
