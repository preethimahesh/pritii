class Table{  
   void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(Thread.currentThread().getName() +" "+  n*i);  
     try{  
     Thread.sleep(500);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  

}  
  
public class TestSynchronization3{  
public static void main(String args[]){  
final Table obj = new Table();//only one object  
  
Thread t1=new Thread(){  
public void run(){  
obj.printTable(100);  
}  };


Thread t2=new Thread(){  
public void run(){  
obj.printTable(500);  
}  
};  
  
t1.start(); 


t2.start();  
}  
}  


