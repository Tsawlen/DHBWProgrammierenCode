package lecture.chapter12;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> myNameStack = new Stack<>();

        myNameStack.push("Hans");
        myNameStack.push("Saber");
        myNameStack.push("Mai Sakurajima");
        myNameStack.peek();
        myNameStack.push("Rias");
        myNameStack.peek();

        System.out.println(myNameStack.pop());
        System.out.println(myNameStack.pop());
        System.out.println(myNameStack.pop());
        System.out.println(myNameStack.pop());

        myNameStack.push("Asuna");
        myNameStack.peek();



    }

}
