import java.lang.*;

public class ThreadGroupDemo1 implements Runnable {
   public static void main(String[] args) {
      ThreadGroupDemo1 tg = new ThreadGroupDemo1();
      tg.func();
   }

   public void func() {
      try {     
       
         ThreadGroup pGroup = new ThreadGroup("Parent ThreadGroup");
    
         
         ThreadGroup cGroup = new ThreadGroup(pGroup, "Child ThreadGroup");
         ThreadGroup gcGroup = new ThreadGroup(cGroup, "grdgrop");

        
         Thread t1 = new Thread(pGroup, this);
         System.out.println("Starting " + t1.getName() + "...");
         t1.start();
            
         
         Thread t2 = new Thread(cGroup, this);
         System.out.println("Starting " + t2.getName() + "...");
         t2.start();
         Thread t3 = new Thread(gcGroup, this);
         System.out.println("Starting " + t3.getName() + "...");
         t3.start();
            
        System.out.println("Active threads in \"" + pGroup.getName() 
            + "\" = " + pGroup.activeCount());

         
         t1.join();
         t2.join();
         t2.join();
      } catch (InterruptedException ex) {
         System.out.println(ex.toString());
      }
   }

   
   public void run() {

      for(int i = 0;i<1000;i++) {
         i++;
      }
      System.out.println(Thread.currentThread().getName() + " finished executing.");
   }
} 