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