import java.util.Scanner;
import java.util.ArrayList;
public class shoppingcart {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of products you want to add in cart : ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            products.add(sc.next());
        }

        System.out.println(products);
        System.out.print("Enter the product number yoy want to remove : ");
        String p=sc.next();

        products.remove(p);
        System.out.println(products);
        System.out.print("Enter the product you want to search : ");
        String q= sc.next();
        if(products.contains(q)){
            System.out.println("The product is available");
        }
        else {
            System.out.println("The product is not available");
        }

        System.out.println(products.size()+" products in the list");
        System.out.println(products);




    }
}
