
import java.util.ArrayList;
public class secd3 {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.cartID = "c01";
        sc.customerName = "Me";

        Products p1 = new Products("Water", 20,2);
        Products p2 = new Products("Kurmure", 50,6);
        Products p3 = new Products("Banana", 10, 12);
        sc.addItems(p1);
        sc.addItems(p2);
        sc.addItems(p3);
        sc.cartDetails();
       System.out.println("The total price of:\n"+p1.ProductName+","+p2.ProductName+" & "+p3.ProductName+" is "+sc.calculateTotal());

    }
}
class Products {
    String ProductName;
    double PricePerUnit;
    int Quantity;
    Products(String ProductName, double PricePerUnit, int Quantity) {
        this.ProductName = ProductName;
        this.PricePerUnit = PricePerUnit;
        this.Quantity = Quantity;
    }

}

class ShoppingCart {

    String cartID;
    String customerName;

    ArrayList<Products> items = new ArrayList<>();

    void addItems(Products p) {
        items.add(p);
    }

    void cartDetails() {
        System.out.println("Cart ID: " + cartID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Items in the cart:");
        for (Products item : items) {
            System.out.println("Product Name: " + item.ProductName +", Quantity: "+item.Quantity+", Price per Unit: " + item.PricePerUnit);
        }
    }
    double calculateTotal(){
        double Total=0;
        for (Products item : items) {
            Total += item.PricePerUnit*item.Quantity;
        }
        return Total;
    }
}
