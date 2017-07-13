interface Object11
{
void display();
}
public class Object111
{
    public static void main(String args[])
    {
        Object11 o=new Object11(){
        
            public void display()
            {
                System.out.println("11111");
            }
        };
        
        o.display();
    }
} 
