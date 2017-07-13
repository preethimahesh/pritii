interface Baskar1
{
    
     void show();
}
public class Baskar
{
    public static void main(String[] args) 
{

    Baskar1 ob=new Baskar1()
        {
        public  void show()
         {
         System.out.println("hai");   
            }
           
     };
    ob.show();
 }
}