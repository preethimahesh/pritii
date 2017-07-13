class Arithmat
{ 
     public void division(int num1, int num2)
      { 
           System.out.println(num1/num2);
         }  
          public void method1(int num1, int num2 )
           { 
               division(num1, num2); 
            }  
             public void method2(int num1, int num2)
             {
                  try
                  { 
                      method1(num1, num2);
                     }
                     catch(Exception e){
                          System.out.println("Exception Handled"); 
                        } 
                    } 
                }
                 class Arithmat2
                 {
                      public static void main(String args[])
                     { 
                          Arithmat obj = new Arithmat(); 
                           obj.method2(20, 0);
                    } 
                 }