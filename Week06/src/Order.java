import java.util.*;

public class Order {

    protected int id;
    //protected int price;
    //protected int weight;
     int quantity;
    //protected List<Product> products;
    protected String orderDate;

    public Order(int id, int quantity) {
        this.id = id;
        //this.products = products;
        //this.orderDate = orderDate;
        this.quantity = quantity;

        }

    public void listOrders(int orderId, int orderQuantity, String refDate){
        System.out.println( "S-a vandut in ziua " + refDate + " produsul cu ID-ul " + orderId + " cu cantitatea " + orderQuantity + " vanduta");
    }




    }

