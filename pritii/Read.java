import java.io.FileInputStream;  
public class Read {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("D:\\hai.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
            System.out.println("ok");
          }catch(Exception e){System.out.println(e);}    
         }    
        }  