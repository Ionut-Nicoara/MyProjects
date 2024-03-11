package isp.lab6.exercise1;
import java.util.ArrayList;
import java.util.List;


public class GradesManagementSystem {

    ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student s){
        list.add(s);
    }
    public void removeStudent(Student s){ list.remove(s);}

    public void updateStudent(Student student, String name, String department, int age) {
        student.setName(name);
        student.setDepartment(department);
        student.setAge(age);
    }

    void printAll(){
        for(Student s:list) System.out.println(s);
    }

    public Student SearchByName(String name) {
        for (Student s:list) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }
}
