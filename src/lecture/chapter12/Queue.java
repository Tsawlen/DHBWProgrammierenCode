package lecture.chapter12;

public class Queue<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;

    public void enqueue(T data)
    {
        Node<T> newNode = new Node<>(data);

        if(firstNode == null)
        {
            firstNode = newNode;
            lastNode = newNode;
            return;
        }

        lastNode.setBehind(newNode);
        newNode.setBefore(lastNode);

        lastNode = newNode;
    }

    public T dequeue()
    {
        if(firstNode == null)
        {
            System.out.println("List is emtpy!");
            return null;
        }

        Node<T> toReturn = firstNode;

        if(firstNode == lastNode)
        {

            firstNode = null;
            lastNode = null;
            return toReturn.getData();
        }

        firstNode = firstNode.getBehind();
        return toReturn.getData();
    }



    private class Node<D>
    {
        private Node before;
        private Node behind;
        private D data;

        public Node(D data)
        {
            this.data = data;
        }

        public void setBefore(Node before)
        {
            this.before = before;
        }

        public void setBehind(Node behind)
        {
            this.behind = behind;
        }

        public Node getBefore()
        {
            return this.before;
        }

        public Node getBehind()
        {
            return this.behind;
        }

        public D getData()
        {
            return this.data;
        }


    }

}
