
import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.IOException;
class ReadTest
{
 public static void main(String[] args)
 {
  try 
  {
   File fl = new File("D:/haii.txt");
   BufferedReader br = new BufferedReader(new FileReader(fl)) ;
   String str;
   while ((str=br.readLine())!=null)
   {
    System.out.println(str);
   }
   br.close();
   fl.close();
  }
  catch (Exception  e)
  { e.printStackTrace(); }
 }
}