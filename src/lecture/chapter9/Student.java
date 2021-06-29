package lecture.chapter9;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private int age;
    private String familyName;
    private String name;
    private int studentId;


    public Student(int studentId, String name, String familyName, int age)
    {
        this.setStudentId(studentId);
        this.setName(name);
        this.setFamilyName(familyName);
        this.setAge(age);

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.studentId != o.getStudentId())
        {
            return this.studentId - o.getStudentId();
        }

        if(!this.familyName.equals(o.getFamilyName()))
        {
            return this.familyName.compareTo(o.getFamilyName());
        }

        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", familyName='" + familyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode()
    {
        // ^ wird verwendet, damit man nicht aus dem Bereich des int rauskommt
        return this.getStudentId() ^ this.getFamilyName().hashCode() ^ this.getName().hashCode() /*^ this.getAge() --> entfernt für Konsitenz*/ ;
    }

   /* @Override
    public int hashCode()
    {
        //es wird mit 31 (Primzahl) multipliziert um eine Streuung zu realisieren. In jeder Subklasse sollte auch ein andere Primzahlmultiplikator verwendet werden um die Streuung zu gewährleisten.
        int result = age;
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result +studentId;
        return result;
    }*/

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }

        if(o == null)
        {
            return false;
        }


        // typ check --> .getClass, damit es generischer ist
        if(this.getClass() != o.getClass())
        {
            return false;
        }

        //Feld (Attribut) Vergleich

        Student s = (Student)o;

        if(this.getStudentId() != s.getStudentId())
        {
            return false;
        }

        if(!this.getFamilyName().equals(s.getFamilyName()))
        {
            return false;
        }

        if(!this.getName().equals(s.getName()))
        {
            return false;
        }

        /* --> entfernen für compareTo Konsitenz
        if(this.getAge() != s.getAge())
        {
            return false;
        }
        /*
         */

        return true;

        //Meine Ungünstige Lösung
       /* if(o != null)
        {
            if(o instanceof Student)
            {
                Student s = (Student)o;
                if(((Student) o).getAge() != this.getAge())
                {
                    return false;
                }
                if(!((Student) o).getFamilyName().equals(this.getFamilyName()))
                {
                    return false;
                }
                if(!((Student) o).getName().equals(this.getName()))
                {
                    return false;
                }
                if(((Student) o).getStudentId() != this.getStudentId())
                {
                    return false;
                }
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }*/
    }
}
