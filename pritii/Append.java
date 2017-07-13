import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter; 
 class Append{ 
public static void main(String args[]){ 
//String num="A";
//int a; 
try{ 
FileWriter fw=new FileWriter("D:\\vj.txt"); 
//a=Integer.parseInt(num); 
//fw.write(a); 
for(int i=0;i<10;i++)
{
System.out.println(i);
// fw.write(i);
fw.append(i + "\n\n");
}
fw.close();
}catch(Exception e){
System.out.println(e);
} 
System.out.println("Success..."); 
} 
}