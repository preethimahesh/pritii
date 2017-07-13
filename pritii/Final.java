class Final
 {
     
     static void procX() {
         try {
             
             System.out.println("inside procX");
             throw new RuntimeException("demo");
             
         } finally {
             
             System.out.println("procX's finally");
             
         }
     }
     
     static void procY() {
         try {
             
             System.out.println("inside procY");
           //  return;
             
         } finally {
             
             System.out.println("procY's finally");
             
         }
     }
     
     
     static void procZ() {
         try {
             
             System.out.println("inside procZ");
             
         } finally {
             
             System.out.println("procZ's finally");
             
         }
     }
     
     public static void main(String args[])
     {
         try {
             
             procX();
             
         } catch(Exception e) {
             
             System.out.println("Exception caught"+e);
             
         }
         
         procY();
         procZ();
     }
 }