class Throw
{
    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e;
    }
    catch(ArithmeticException e1)
    {
        System.out.println("Caught inside 1 fun().");
            throw e1;
    }
 
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
        catch(ArithmeticException e1)
    {
        System.out.println("Caught inside 2 fun().");
            
    }
 
    }
}