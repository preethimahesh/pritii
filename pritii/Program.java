import jdk.nashorn.internal.ir.CatchNode;

class Program
 {
   public  static void demometh() throws IllegalAccessException {
         
         System.out.println("Inside demometh");
         
             throw new IllegalAccessException("demo");
           
     }
     public  static void demometh1() throws NullPointerException {
         
         System.out.println("Inside demometh1");
         
             throw new NullPointerException("demo1");
           
     }
     

     
     public static void main(String args[])
     {
        
         try {
             
             try
             {
             int a=10/0;
             demometh();
             }
              catch(IllegalAccessException e) {
             
             System.out.println("Caught " + e);
              }
              try {
                   
             demometh1();
              } 
              catch (NullPointerException e1) {
            System.out.println("vb"+e1); 
              }
        
             
         }
        
         catch(Exception e) {
             
             System.out.println("Caug/; " + e);
         }
        
             
         }
         
     }
 