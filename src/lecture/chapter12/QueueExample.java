package lecture.chapter12;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> myNameQueue = new Queue<>();

        myNameQueue.enqueue("Hans");
        System.out.println(myNameQueue.dequeue());

        myNameQueue.enqueue("Hans");
        myNameQueue.enqueue("Asuna");
        myNameQueue.enqueue("Kirito");
        myNameQueue.enqueue("Rias");
        myNameQueue.enqueue("Mai Sakurajima");

        System.out.println(myNameQueue.dequeue());
        System.out.println(myNameQueue.dequeue());
        System.out.println(myNameQueue.dequeue());
        System.out.println(myNameQueue.dequeue());
        System.out.println(myNameQueue.dequeue());
        System.out.println(myNameQueue.dequeue());



    }
}
