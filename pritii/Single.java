class Single
{
private static Single instance;
private Single()
{
System.out.println(" i am a constructor method ");
}
public static Single getre()
{
if(instance == null)
instance = new Single();
return instance;
}
public void display()
{
System.out.println(" hai ");
}
public static void main(String args[])
{
Single tmp=Single.getre();
Single tmp1=Single.getre();
tmp.display();
tmp1.display();
}
}