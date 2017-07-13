class Single
{
    private static Single s=new Single();
    private Single()
    {
        System.out.println("hai");
    }
    public static Single getob()
    {
        return  s;
    }
    public static void display()
    {
        System.out.println("baskar");
        
    }
    public static void show()
    {
        System.out.println("welcome");
    }
}
class Single1
{
    public static void main(String args[])
    {
        
     Single a=Single.getob();
     a.display();
     a.show();
    }
}
