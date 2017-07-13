//@FunctionalInterface

interface Sayable{  

    void say1();
    //void say();
    
}  
public class MethodReference {  
    public void ramya()
    {
        System.out.println("method referenced");
    }
   public void say(){  
        System.out.println("Hello, this is static method.");  
    }
    public void say1()
    {
        System.out.println("helo");
    }
        public static void main(String[] args) {  
            MethodReference methodReference=new MethodReference();
         Sayable sayable = methodReference::ramya;
       sayable.say1();

       //say1();
      //sayable.say1(); 
      
    }  
}  