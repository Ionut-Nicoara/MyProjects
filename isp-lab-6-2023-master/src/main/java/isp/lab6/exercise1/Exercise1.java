package isp.lab6.exercise1;

public class Exercise1
{
    public static void main(String[] args)
    {

        /* Student1 = new Student("Erwin", "Computer Science", 20);
        Student Student2 = new Student("Alex", "Physics", 21);
        Student Student3 = new Student("Andrei", "Biology ", 19);

        System.out.println(Student1);
        System.out.println(Student2);
        System.out.println(Student3); */

        GradesManagementSystem system = new GradesManagementSystem();

        Student Student1 = new Student("Erwin", "Computer Science", 20);
        Student1.addGrade("Math", 8);
        Student1.addGrade("English", 10);
        system.addStudent(Student1);

        Student Student2 = new Student("Alex", "Physics", 21);
        Student2.addGrade("Physics", 10);
        Student2.addGrade("Math", 8);
        system.addStudent(Student2);

        Student Student3 = new Student("Andrei", "Biology", 19);
        Student3.addGrade("Chemistry", 10);
        Student3.addGrade("Biology", 9);
        system.addStudent(Student3);

        // Search for a student by name
        String nameToSearch = "Alex";
        Student foundStudent = system.SearchByName(nameToSearch);
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent);
            System.out.println("Average grade: " + foundStudent.calculateAverageGrade());
        } else {
            System.out.println("No student found with name: " + nameToSearch);
        }
        // Update a student's information
        system.updateStudent(Student1, "Cosmin", "\n" + "Mathematics", 21);
        // Remove a student from the list
        system.removeStudent(Student1);

        // Display the list of students
        system.printAll();
    }


}

