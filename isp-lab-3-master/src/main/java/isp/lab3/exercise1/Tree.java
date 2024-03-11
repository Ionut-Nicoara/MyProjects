package isp.lab3.exercise1;

public class Tree {

    private int height;

    public Tree(){
        this.height = 15;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void Grow(int meters){
        if (meters >= 1){
            height += meters;
        }
   }

   public String toString(){
        return "Height is: " + height;
   }
}
