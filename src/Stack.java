class Node
{
    int data;
    Node next;

    public void setdata(int data)
    {
        this.data=data;
    }

    public int getdata()
    {
        return data;
    }


    public void setnext(Node next)
    {
        this.next=next;
    }

    public Node getnext()
    {
        return next;
    }
}



public class Stack {
    Node top=null ;

    public boolean isempty() {
        return top==null;
    }


    public void push(int val) {
        Node n = new Node();
        if (isempty()) {
            n.setdata(val);
            top=n;
        }

        else
        {
         Node temp=top;
         n.setdata(val);
         n.setnext(top);
         top=n;
         }

        }


        public void pop()
        {
            if(top==null)
            {
                System.out.println("stack is underflow");
            }

            else
            {
                Node temp=top;
                System.out.println("deleted element from stack" +temp.getdata());
                top=temp.next;
            }
        }

        public void display() {
            if (top==null) {
                System.out.println("stAck is empty");
            } else {
                Node temp=top;
                while (temp!= null) {
                    System.out.println(temp.getdata());
                    System.out.println("^");
                    System.out.println("|");
                    temp=temp.getnext();
                }

            }
        }

    public static void main(String[] args) {
Stack obj=new Stack();
        System.out.println(obj.isempty());
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        obj.pop();
        obj.display();

    }
}