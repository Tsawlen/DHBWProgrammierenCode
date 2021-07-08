package lecture.chapter12;

public class LinkedList<T> {

    private Node<T> firstNode;
    private int size = 0;

    public void add(T data)
    {
        Node<T> newNode = new Node(data);
        size++;

        if(firstNode == null)
        {
            firstNode = newNode;
            return;
        }

        Node<T> currentNode = firstNode;

        while(currentNode.getNextNode() != null)
        {
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);

    }

    public boolean contains(T data)
    {
        Node<T> newNode = new Node(data);

        if(firstNode == null)
        {
            return false;
        }

        Node<T> currentNode = firstNode;

        while(currentNode.getNextNode() != null)
        {
            if(currentNode.getData().equals(data)) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }

        if(currentNode.getData().equals(data))
        {
            return true;
        }

        return false;
    }


    public void printList()
    {
        if(firstNode == null)
        {
            System.out.println("List is initial");
            return;
        }

        System.out.println("List: ");
        Node<T> currentNode = firstNode;
        System.out.println(currentNode.getData());
        while(currentNode.getNextNode() != null)
        {
            currentNode = currentNode.getNextNode();
            System.out.println(currentNode.getData());
        }

        System.out.println("End of List!");

    }

    public void print()
    {
        if(firstNode == null) {
            System.out.println("List is empty!");
        }
        print(firstNode);
        System.out.println("End of List");

    }

    private void print(Node<T> currentNode)
    {
        System.out.println(currentNode.getData());
        if(currentNode.getNextNode() != null)
        {
            print(currentNode.getNextNode());
        }
    }

    public boolean remove(T data)
    {
        if(firstNode == null)
        {
            return false;
        }

        if(firstNode.getData().equals(data))
        {
            firstNode = firstNode.getNextNode();
            size--;
            return true;
        }

        Node<T> currentNode = firstNode;

        while(currentNode.getNextNode() != null)
        {
            if(currentNode.getNextNode().getData().equals(data))
            {
                //Node<T> toDelete = currentNode.getNextNode();
                currentNode.setNextNode(currentNode.getNextNode().getNextNode()); // --> Wenn NextNode leer, kommt halt einfach null zurück
                size--;
                return true;
                /*if(toDelete.getNextNode() != null)
                {
                    currentNode.setNextNode(toDelete.getNextNode());
                    size--;
                    return true;
                }
                else
                {
                    currentNode.setNextNode(null);
                    size--;
                    return true;
                }*/

            }
            currentNode = currentNode.getNextNode();
        }

        return false;
    }

    public int size()
    {
        return this.size;
    }


    private class Node<D>
    {

        private D data;
        private Node nextNode;

        public Node(D data)
        {
            this.data = data;
            this.nextNode = null;
        }

        public void setNextNode(Node nextNode)
        {
            this.nextNode = nextNode;
        }

        public Node getNextNode()
        {
            return this.nextNode;
        }

        public D getData()
        {
            return this.data;
        }


    }

}
