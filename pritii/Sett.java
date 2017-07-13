import java.util.*;
import java.util.HashSet;

class Sett
{
    public static void main(String[] args) {
        //Object i="Priti";
        //Object ii=244;
HashSet<Object> setA = new HashSet<Object>();

setA.add("element 0");
setA.add("element 1");
setA.add("element 0");
setA.add("element 2");
//setA.add(2);
setA.remove("element 0");
//access via Iterator
Iterator iterator = setA.iterator();
while(iterator.hasNext()){
  Object element = (Object) iterator.next();
  System.out.println(element);
}
/*
for(Object object : setA) {
    Object element = (Object) object;
    System.out.println(element);
}*/
//System.out.println(i+" "+ii);
    }
}

