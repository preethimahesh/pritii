import java.util.*;
//import java.util.EnumSet.allOf;
import java.util.EnumSet;
public class EnumAll
{
    public enum Numbers{
        ONE,TWO,THREE
    };
    public static void main(String args[])
    {
        EnumSet<Numbers> en= null;
        en=EnumSet.allOf(Numbers.class);
        /*System.out.println(en);
        //EnumAll function
        System.out.println(en);
         EnumSet<Numbers> set2 = en.clone();//EnumClone func
    System.out.println("Set2:" + set2);*/
    EnumSet<Numbers> enn=EnumSet.of(Numbers.THREE);//eliminating particular element from set
    System.out.println(enn);
EnumSet<Numbers> enn1=EnumSet.complementOf(enn);
System.out.println(enn1);
 System.out.println(en);
    }
}   
//EnumSet<Numbers> enn1=EnumSet.range(Numbers.ONE,Numbers.TWO);
//EnumSet<Numbers> enn1=EnumSet.CopyOf(enn);