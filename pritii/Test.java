class Test
{
    static  int show(int a,int b) {
        int c[]=new int[5];
         c[11]=a/b;
         v=c[11];
        return v;
    }
        static int disp(int a,int b)
    {
        int d=0;
        try 
        {
            d=show(a,b);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
           System.out.println(ex); 
        }
        return d;

    }
     public static void main(String args[   ])
     {
         
        int a = 10;
        int b = 2;
         
        try
        {
            int v= disp(a,b);
         
        }
   
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
