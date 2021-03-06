package lecture.chapter9;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, String> myColorMap = new HashMap<>();

        myColorMap.put("blue", "0000FF");
        myColorMap.put("red", "FF0000");
        myColorMap.put("green", "00FF00");

        System.out.println("Anzahl Farben:" + myColorMap.size());
        System.out.println("Code für Rot: " + myColorMap.get("red"));
        System.out.println("Blau enthalten? " + myColorMap.containsKey("blue"));

        Set myCoorKeys = myColorMap.keySet();

        for(Object colorKey : myCoorKeys)
        {
            System.out.println("Key: " + colorKey + " - Value: " + myColorMap.get(colorKey));
        }

        System.out.println("TreeSet? " + (myCoorKeys instanceof SortedSet));


        Map<Integer, String> myCityMap = new TreeMap<>();

        myCityMap.put(new Integer(69190), "Walldorf");
        myCityMap.put(35315, "Homberg"); // --> auto-boxing (ein Wert einfachen Typs wird in ein Objekt der Wrapper Klasse umgewandelt)
        myCityMap.put(69181, "Leimen"); // --> auto-boxing

        System.out.println("PLZ 69190 gehört zu: " + myCityMap.get(69190)); // --> auto-boxing

        Set<Integer> myPostalCodes = myCityMap.keySet();

        for(int postalCode : myPostalCodes) // --> auto-unboxing
        {
            System.out.println("Zur PLZ " + postalCode + " gehört der Ort " + myCityMap.get(postalCode)); //
        }

    }

}
