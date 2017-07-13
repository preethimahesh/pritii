public class Circuit {
  public static void main(String[] argv) {
    int c = 1;
    int e = 98;
    int d = 0;
    if (c == 0 && e++ < 100)
    
      d = 100;

    System.out.println("e is " + e);
    System.out.println("d is " + d);
  
  }
}