package isp.lab6.exercise1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestExercise1 {

    @Test
    public void testAddStudent() {
        Student s1 = new Student("Alice", "Computer Science", 20);
        Student s2 = new Student("Bob", "Physics", 21);
        GradesManagementSystem gms = new GradesManagementSystem();
        gms.addStudent(s1);
        gms.addStudent(s2);
        assertEquals(2, gms.list.size());
    }

    @Test
    public void testRemoveStudent() {
        Student s1 = new Student("Alice", "Computer Science", 20);
        Student s2 = new Student("Bob", "Physics", 21);
        GradesManagementSystem gms = new GradesManagementSystem();
        gms.addStudent(s1);
        gms.addStudent(s2);
        gms.removeStudent(s1);
        assertEquals(1, gms.list.size());
        assertEquals(s2, gms.list.get(0));
    }

    @Test
    public void testUpdateStudent() {
        Student s1 = new Student("Alice", "Computer Science", 20);
        GradesManagementSystem gms = new GradesManagementSystem();
        gms.addStudent(s1);
        gms.updateStudent(s1, "Alice2", "Biology", 21);
        assertEquals("Alice2", s1.getName());
        assertEquals("Biology", s1.getDepartment());
        assertEquals(21, s1.getAge());
    }

    @Test
    public void testCalculateAverageGrade() {
        Student s1 = new Student("Alice", "Computer Science", 20);
        s1.addGrade("Math", 8.0);
        s1.addGrade("Physics", 9.0);
        s1.addGrade("Computer Science", 7.5);
        GradesManagementSystem gms = new GradesManagementSystem();
        gms.addStudent(s1);
        assertEquals(8.00, s1.calculateAverageGrade(), 0.01);
    }

}
