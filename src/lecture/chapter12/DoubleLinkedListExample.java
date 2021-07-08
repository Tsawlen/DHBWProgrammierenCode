package lecture.chapter12;

public class DoubleLinkedListExample {

    public static void main(String[] args) {

        DoubleLinkedList<String> myNameList = new DoubleLinkedList<>();

        myNameList.add("Hans");
        myNameList.add("Gabi");
        myNameList.add("Jotaro");
        myNameList.add("Hime");

        myNameList.print();

        myNameList.addFirst("Rimuru Tempest");

        myNameList.print();

        myNameList.addLast("Miku Nakano");

        myNameList.print();

        System.out.println(myNameList.getSize());

        System.out.println("Enhält Rimuru Tempest: " + myNameList.contains("Rimuru Tempest"));
        System.out.println("Enthält Jotaro: " + myNameList.contains("Jotaro"));
        System.out.println("Enthält Miku Nakano: " + myNameList.contains("Miku Nakano"));
        System.out.println("Enthält Marvin: " + myNameList.contains("Marvin"));

        myNameList.remove("Hime");

        myNameList.print();

        myNameList.remove("Miku Nakano");

        myNameList.print();

        myNameList.addLast("Mai Sakurajima");

        myNameList.print();


    }

}
