//import java.util.*;
import java.util.function.BiFunction;  
class StaticMethodReference{  
public static int add(int a, int b){  
return a+b;  
}  
public static int add(double a, double b){  
return a/b;  
}  
public static double add(float a, float b){  
return a/b;  
}  
}  
  
public class typecasting {  
public static void main(String[] args) {  
BiFunction<Integer,Integer,Integer> adder1 =StaticMethodReference::add;  
BiFunction<Double,Double,Integer> adder2 =StaticMethodReference::add;  
BiFunction<Float,Float,Double> adder3 = StaticMethodReference::add;  
int result1 = adder1.apply(10, 20);  
int result2 = adder2.apply(13d, 3d);  
double result3 = adder3.apply(13f, 3f);  
System.out.println(result1);  
System.out.println(result2);  
System.out.println(result3);  
}  
}  