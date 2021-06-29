package lecture.chapter9;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        Set<String> myNameSet = new TreeSet<>();

        myNameSet.add("Colin");
        myNameSet.add("Zeus");
        myNameSet.add("Dietmar");
        myNameSet.add("Gabi");
        myNameSet.add("Susanne");

        System.out.println("Hinzugefügt? " + myNameSet.add("Colin"));
        System.out.println("Anzahl Namen: " + myNameSet.size());
        System.out.println("Enthält Zeus? " + myNameSet.contains("Zeus"));

        for(String name: myNameSet)
        {
            System.out.println("Name: " + name);
        }

        Iterator<String> myNameSetIterator = myNameSet.iterator();
        while(myNameSetIterator.hasNext())
        {
            String name = myNameSetIterator.next();
            System.out.println("Name: " + name);
            if(name.equals("Dietmar"))
            {
                myNameSetIterator.remove();
            }
        }

    }

}
