package ocp;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new LinkedList<Student>();

        students.add(new Student("Juanito Pérez", StudentType.Undergraduate));
        students.add(new Student("Juanita Pérez", StudentType.Undergraduate));
        students.add(new Student("Juan Pablo", StudentType.MasterStudent));
        students.add(new Student("Marco", StudentType.MasterStudent));
        students.add(new Student("Luz", StudentType.MasterStudent));
        students.add(new Student("Juan Pérez", StudentType.PhDStudent));
        students.add(new Student("Juana Pérez", StudentType.PhDStudent));

        for (Student student : students) {
            System.out.println("" + student);
        }

        System.out.println();

        for (Student student : students) {
            student.saySomething();
        }
    }
}
