package lecture.chapter9;

import lecture.chapter6.Dog;

import java.util.*;

public class StudentsInContainer {

    public static void main(String[] args) {

        Set<Student> studentSet = new TreeSet<>();

        Student a = new Student(1234, "Zeus", "Gott", 54);
        Student b = new Student(1234, "Zeus", "Gott", 54);
        Student c = new Student(1234, "Zeus", "Gott", 53);
        Student d = new Student(1234, "Zeus", "Goettlich", 54);
        Student e = new Student(1234, "Loki", "Gott", 54);
        Student f = new Student(12345, "Zeus", "Gott", 54);
        Student g = null;
        Dog myDog = new Dog(123, "Hund", 23, "Dackel");

        System.out.println("Vergleiche");
        System.out.println("mit b: " + a.equals(b));
        System.out.println("mit c: " + a.equals(c));
        System.out.println("mit d: " + a.equals(d));
        System.out.println("mit e: " +a.equals(e));
        System.out.println("mit f: " +a.equals(f));
        System.out.println("mit g: " +a.equals(g));
        System.out.println("mit myDog: " +a.equals(myDog));


        studentSet.add(new Student(1234, "Zeus", "Gott", 54));
        studentSet.add(new Student(9281, "Gabi", "Mayer", 23));
        studentSet.add(new Student(4711, "Dietmar", "Henning", 25));
        studentSet.add(new Student(4821, "Colin", "Mayer", 21));
        studentSet.add(new Student(4821, "Devin", "Mayer", 21));
        studentSet.add(new Student(9281, "Gabi", "Fritz", 23));

        System.out.println("Anzahl Studenten: " + studentSet.size());

        for(Student student : studentSet)
        {
            System.out.println(student);
        }

        // Variante 1: Set mit externer Sortierung
        System.out.println("Students by age:");
        Set<Student> myStudentSetSortedByAge = new TreeSet<>(new StudentSortByAge());
        myStudentSetSortedByAge.addAll(studentSet);

        for(Student student : myStudentSetSortedByAge)
        {
            System.out.println(student);
        }

        // Variante 2: Liste die sortiert wird
        System.out.println("Students by age list: ");
        List<Student> myStudentListSortedByAge = new ArrayList<>();
        myStudentListSortedByAge.addAll(studentSet);

        myStudentListSortedByAge.sort(new StudentSortByAge());

        for(Student student : myStudentListSortedByAge)
        {
            System.out.println(student);
        }

        Comparator<Student> sortStudentsByNumberOfSignsInFamilyName = (Student o1, Student o2) -> {
            return o1.getFamilyName().length() - o2.getFamilyName().length();
        };

        //Sortieren nach der Anzhal der Buchstaben im Nachnamen --> über eine Lamda Funktion
        myStudentListSortedByAge.sort(sortStudentsByNumberOfSignsInFamilyName);

        System.out.println("Students number of sign in familname (list): ");
        for(Student student : myStudentListSortedByAge)
        {
            System.out.println(student);
        }

        //Sortieren nach der Anzhal der Buchstaben im Nachnamen --> über eine Interne Anonyme Klasse
        myStudentListSortedByAge.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFamilyName().length() - o2.getFamilyName().length();
            }
        });

    }

}
