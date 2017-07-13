
class Example
{
    public static void main(String args[])
    {
    try{
      // int a=25/0;
        int b[]=new int[5];
        //b[]=25/1  ;
        b[10]=25/0;
    
        }
        
        catch(Exception e)
   {
       System.out.println("common task completed");
       }  
      catch(ArithmeticException e)
        {
            System.out.println("task1 is completed");
        }  
   catch(ArrayIndexOutOfBoundsException e)
   {
       System.out.println("task 2 completed");
   }  
   
        System.out.println("cmp");
        finally
        {
            System.out.println("hai");
        }
    }
}