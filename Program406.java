
class Demo
{
    public int i,j;
}

class Program406
{
    public static void main(String arg[])
    {
        Demo obj = null;                    // It is a reference    
        obj = new Demo();                   // refer the object of demo class           

        obj.i = 11;                         // to put the contents 
        obj.j = 21;                         // to put the contents
    }
}

// Demo.obj   =>    it is a empty container which will point to the object of demo class in future but it currently points to nothing