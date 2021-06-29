package lecture.chapter9;
import lecture.chapter5.Student;
import lecture.chapter6.Bird;

import java.util.*;


public class ListExample {

    public static void main(String[] args) {


        List<String> myNameList = new ArrayList<>();

        myNameList.add("Klaus");
        myNameList.add("Hans");
        myNameList.add("Fritz");
        myNameList.add("Dietmar");
        myNameList.add("Colin");
        myNameList.add("Gabi");
        //myNameList.add(new Student());
        //myNameList.add(new Bird(true));  --> Nicht möglich, weil falscher Datentyp

        System.out.println("Name Index 2: " + myNameList.get(2));
        System.out.println("Enthält Colin? " + myNameList.contains("Colin"));

        System.out.println("Iteration: For-Each");
        for(String name : myNameList)
        {
            System.out.println("Name: " + name);
            // merke - modifizieren der Liste während der Iteration problematisch
        }

        //in for Schleife darf nicht die Liste modifizieren

        // Sequentieller Zugriff mit Iterator
        System.out.println("Iteration: Iterator");
        Iterator<String> myNameListIterator = myNameList.iterator();
        /*myNameList.add("Gabi");
        myNameList.remove(2);*/ // --> Exception ConcurrentModificationException
        try
        {
            while(myNameListIterator.hasNext())
            {
                String name = myNameListIterator.next();
                System.out.println("Name: " + name);
                if(name.equals("Dietmar"))
                {
                    myNameListIterator.remove(); // --> Colin ist noch da!
                }
            }
        }
        catch(ConcurrentModificationException e)
        {
            System.out.println();
        }


    }
}
