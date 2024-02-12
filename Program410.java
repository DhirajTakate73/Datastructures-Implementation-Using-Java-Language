
class node
{
    public int data;
    public node next;

    public node(int no)
    {
        data = no;
        next = null;
    }
}

class SinglyLL
{
    private node first;
    private int Count;

    public SinglyLL()
    {
        first = null;
        Count = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = new node(no);               // created new node     newn is reference which will refer to object of newly created node then it will go towards constructor of node class and there values get initilaised

        if(first == null)   // LL is empty
        {
            first = newn;
        }
        else               // LL contains nodes
        {
            newn.next = first;
            first = newn;
        }
        Count++;                    // common for both if else part
    }


    public void InsertLast(int no){}
    public void InsertAtPos(int no, int ipos){}
    public void DeleteFirst(){}
    public void DeleteLast(){}
    public void DeleteAtPos(int ipos){}
    public void Display(){}

    public int Count()
    {
        return Count;
    }
}

class Program410
{
    public static void main(String arg[])
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
    }
}