package lecture.chapter12;

public class LinkedListExample {


    public static void main(String[] args) {


        LinkedList<String> myNameList = new LinkedList<String>();

                                    //Komplexität
        myNameList.add("Klaus");    // O(1)
        myNameList.add("Franz");    // O(2)
        myNameList.add("Gabi");     // O(3)
        myNameList.add("Steffi");   // O(4)
        myNameList.add("Michel");   // O(5)
        //myNameList.add(new Object()); --> geht nicht, wegen Generic Typisierung

        System.out.println("Enthält Klaus: " + myNameList.contains("Klaus"));
        System.out.println("Enthält Gabi: " + myNameList.contains("Gabi"));
        System.out.println("Enthält Michel: " + myNameList.contains("Michel"));
        System.out.println("Enthält Michel: " + myNameList.contains("Fritz"));

        //myNameList.printList(); // --> schleife
        myNameList.print();  // --> Rekursiv

        System.out.println("Größe der Schleife: " + myNameList.size());

        System.out.println(myNameList.remove("Klaus"));
        System.out.println(myNameList.remove("Franz"));
        System.out.println(myNameList.remove("Michel"));

        myNameList.print();
        System.out.println(myNameList.size());

    }

}
