
class node
{
    public int data;
    public node next;

    public node(int no)         // Constructor
    {
        data = no;             // newn -> data = no;
        next = null;           // newn -> next = null;
    }
}

class SinglyLL
{
    private node first;
    private int Count;

    public SinglyLL()
    {
        first = null;
        Count = 0
    }
}

class Program408
{
    public static void main(String arg[])
    {
        SinglyLL obj = new SinglyLL();
    }
}