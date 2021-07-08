package lecture.chapter12;

public class Stack<T> {

    private Node<T> bottom;
    private Node<T> highest;
    private int size;


    public void push(T data)
    {
        size++;
        Node<T> newNode = new Node(data);

        if(bottom == null)
        {
            bottom = newNode;
            highest = newNode;
            newNode.setBelow(null);
        }
        else
        {
            newNode.setBelow(highest);
        }


        highest.setAbove(newNode);


        highest = newNode;
    }

    public void peek()
    {
        System.out.println(highest.getData());
    }

    public T pop()
    {
        Node<T> toReturn = highest;

        if(highest == null)
        {
            return null;
        }

        if(toReturn.getBelow() != null)
        {
            if(toReturn.getBelow().getBelow() != null)
            {
                toReturn.getBelow().setBelow(toReturn.getBelow().getBelow());
                toReturn.getBelow().setAbove(null);
                highest = toReturn.getBelow();
                return toReturn.getData();
            }
            else
            {
                highest.getBelow().setAbove(null);
                //highest.getBelow().setBelow(null);
                bottom = highest.getBelow();
                highest = toReturn.getBelow();
                return toReturn.getData();

            }
        }
        else
        {
            highest = null;
            bottom = null;
            return toReturn.getData();
        }
    }



    private class Node<D>
    {
        Node above;
        Node below;
        D data;

        public Node(D data)
        {
            this.data = data;
        }

        public Node getAbove()
        {
            return above;
        }

        public void setAbove(Node above)
        {
            this.above = above;
        }

        public Node getBelow()
        {
            return this.below;
        }

        public void setBelow(Node below)
        {
            this.below = below;
        }

        public D getData()
        {
            return this.data;
        }

    }



}
