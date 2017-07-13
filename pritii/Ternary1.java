class Ternary1
{
    public static void main(String args[])
    {
        int i=25;
        String s=(i>45)?"vb":(i<30)?"vb":"vj";
      s+=(i>45)?"vb":(i<30)?(i>25):"vb";
        System.out.println(s);
        
    }
}
  