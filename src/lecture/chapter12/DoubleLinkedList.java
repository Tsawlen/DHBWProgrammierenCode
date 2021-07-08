package lecture.chapter12;

public class DoubleLinkedList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public void add(T data)
    {

        size++;
        Node<T> newNode = new Node<>(data);

        if(firstNode == null)
        {
            firstNode = newNode;
            lastNode = newNode;
            newNode.setLastNode(null);
            newNode.setNextNode(null);
            return;
        }


        newNode.setLastNode(lastNode);
        lastNode.setNextNode(newNode);

        lastNode = newNode;

    }

    public void addFirst(T data)
    {
        size++;
        Node<T> newNode = new Node<>(data);

        if(firstNode != null)
        {
            newNode.setNextNode(firstNode);
            firstNode.setLastNode(newNode);
        }

        firstNode = newNode;

    }

    public void addLast(T data)
    {
        size++;
        Node<T> newNode = new Node<>(data);

        if(lastNode != null)
        {
            lastNode.setNextNode(newNode);
            newNode.setLastNode(lastNode);
            lastNode = newNode;
        }

    }

    public void remove(T data)
    {
        if(firstNode != null)
        {
            if(firstNode.getData().equals(data))
            {
                if(firstNode.getNextNode() != null)
                {
                    firstNode = firstNode.getNextNode();
                    size--;
                    return;
                }
                else
                {
                    firstNode = null;
                    size--;
                    return;
                }
            }

            Node<T> currentNode = firstNode;

            while(currentNode.getNextNode() != null)
            {
                if(currentNode.getData().equals(data))
                {
                    currentNode.getLastNode().setNextNode(currentNode.getNextNode());
                    currentNode.getNextNode().setLastNode(currentNode.getLastNode());
                    size--;
                    return;
                }
                currentNode = currentNode.getNextNode();
            }

            if(currentNode.getData().equals(data))
            {
                currentNode.getLastNode().setNextNode(currentNode.getNextNode());
                lastNode = currentNode.getLastNode();
                size--;
                return;
            }

        }
        System.out.println("List is empty!");
    }

    public boolean contains(T data)
    {
        if(firstNode != null)
        {

            Node<T> currentNode = firstNode;
            while(currentNode.getNextNode() != null)
            {
                if(currentNode.getData().equals(data))
                {
                    return true;
                }
                currentNode = currentNode.getNextNode();
            }

            if(currentNode.getData().equals(data))
            {
                return true;
            }

        }
        return false;
    }

    public int getSize()
    {
        return size;
    }

    public void print()
    {

        if(firstNode == null)
        {
            System.out.println("List is empty!");
            return;
        }

        System.out.println("Begin of List: ");
        Node<T> currentNode = firstNode;
        System.out.println(currentNode.getData());
        while(currentNode.getNextNode() != null)
        {
            currentNode = currentNode.getNextNode();
            System.out.println(currentNode.getData());

        }

        System.out.println("End of List");

    }


    private class Node<D>
    {
        private Node nextNode;
        private Node lastNode;
        private D data;

        public Node(D data)
        {
            this.data = data;
        }

        public void setNextNode(Node nextNode)
        {
            this.nextNode = nextNode;
        }

        public void setLastNode(Node lastNode)
        {
            this.lastNode = lastNode;
        }

        public Node getNextNode()
        {
            return nextNode;
        }

        public Node getLastNode()
        {
            return lastNode;
        }

        public D getData()
        {
            return this.data;
        }


    }

}
