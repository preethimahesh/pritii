import java.util.stream.IntStream;
//import java.util.Random;
import java.util.Arrays;
//import java.util.Random;
import java.util.function.Function;
//import java.util.concurrent.ThreadLocalRandom;
public class Streamm {  
    public static void main(String[] args) {  
      // String[] a=new String[]{"Poov","Hai","Hello","Priti","Ramya"};
        //List<String> productsList = Arrays.asList(a);  
        //ArrayList<> s=new ArrayList<>
      
        /*productsList.add(new Product(25000f));  
        productsList.add(new Product(30000f));  
        productsList.add(new Product(28000f));  
        productsList.add(new Product(28000f));  
        productsList.add(new Product(90000f));  */
   // IntStream.iterate(0, i->i+2).limit(5)
    //.forEach(System.out::println);
   /* Random rm=new Random();
    for(int i=0;i<5;i++)
    {
    int a=rm.nextInt(20);
    System.out.println(a);
    a=0;
}*/

    //IntStream.generate(()-> ThreadLocalRandom.current().nextInt(20)).limit(5).forEach(System.out::println);
     //Stream.of("we","Poov","Hai","Hello","Priti","Ramya").forEach(System.out::println);
     //.parallel().forEach(n->System.out.println((char) n));
  // .ifPresent(System.out::println)
       //.filter(p -> p.startsWith("H")).forEach(System.out::println) ;
              //.count()   ; 
       //.forEach(System.out::println);
       //System.out.println(st);
           //}  ;
           IntStream.of(1,2,3,4).ifPresent(System.out::println);
}  
}
-----------------------------------------------------------------------------------


import java.util.*;
import java.util.function.Function;
class ForeachParalel
{
        public static void main(String args[])
    {
       
        String s="preethi";
        s.chars().parallel().forEach(n->System.out.print((char) n));
       // s.chars().stream().parallel().map(n->n.name).forEach(System.out::println);
       System.out.format("%s\n",s);
       System.out.printf("%s",s);
    }
}