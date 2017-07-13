import java.util.*;  
class Product{  
    int id;  
    String name;  
    int price;  
    public Product(int id, String name, int price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStream {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000));  
        productsList.add(new Product(2,"Dell Laptop",30000));  
        productsList.add(new Product(3,"Lenevo Laptop",28000));  
        productsList.add(new Product(4,"Sony Laptop",28000));  
        productsList.add(new Product(5,"apple Laptop",90000));  
        productsList.stream()  
                   // .filter(p ->p.price>25000)   // filtering price  
                    //.map(pm ->pm.price)  
                    .filter(s -> s.startsWith("A"))
                    .map(String::toUpperCase)
                    //.map(pmm->pmm.price)        // fetching price  
                    .forEach(System.out::println);  // iterating price  
                    //System.out.println(productsList);
   }  
    
}  