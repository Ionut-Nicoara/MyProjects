package isp.lab6.exercise1;
import java.util.stream.DoubleStream;
import java.util.HashMap;
public class Student {

    private String name;
    private String department;
    private int age;

    private  HashMap <String, Double> grades = new HashMap<>();
    public Student(String name, String department, int age){
        this.name = name;
        this.department = department;
        this.age = age;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    public double calculateAverageGrade(){
        if(grades.size()==0)
            return 0;

        int sum = 0;
        for(Double d: grades.values()){
            sum+=d;
        }
        return sum/grades.size();
    }

    public void addGrade(String clas, double grade){
        grades.put(clas,grade);
    }
}
