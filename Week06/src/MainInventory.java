import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainInventory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome! Choose the number from the options below to continue:");
        System.out.println("1. Create product and add it to stock");
        System.out.println("2. Sell product");
        System.out.println("3. Display daily sales and report");
        System.out.println("4. Exit");

        List<Product> ProductList = new ArrayList<>();
        List<Order> OrderList = new ArrayList<>();
        
        ProductList.add(new Animal("Pate", 11, 30, 1, 5, "2020.10.10", 4));
        ProductList.add(new Animal("Milk", 12, 10, 1, 20, "2019.09.20", 4));
        ProductList.add(new Animal("Sausage", 13, 20, 3, 50, "2019.12.25", -20));
        ProductList.add(new Animal("Cheese", 14, 5, 3, 12, "2019.9.30", 4));
        ProductList.add(new Animal("Dog", 15, 200, 2, 40, "2050.01.01", 40));
        ProductList.add(new Vegetal("Apple", 21, 5, 1, 60, "2029.09.20", "D,E,C"));
        ProductList.add(new Vegetal("Broccoli", 22, 30, 2, 900, "2019.10.20", "B,L,E,H"));
        ProductList.add(new Vegetal("Fungus", 23, 5, 3, 100, "2200.01.01", "P,L,M"));

        String option = "";
        option = sc.next();
        sc.nextLine();

        while (!option.equals("4")){

            switch (option){

                case ("1"):
                    for (Product a : ProductList){
                        a.listProducts();
                    }
                    System.out.println("What kind of product do you want to add? 1 - animal or 2 - vegetal");
                    String productType = sc.nextLine();
                    System.out.println("Care este ID-ul produsului?");
                    int id = sc.nextInt();
                    System.out.println("Denumirea produsului?");
                    String name = sc.next();
                    System.out.println("Ce pret are?");
                    int price = sc.nextInt();
                    System.out.println("Ce greutate?");
                    int weight = sc.nextInt();
                    System.out.println("Care este cantitatea adaugata la stoc?");
                    int quantity = sc.nextInt();
                    System.out.println("Data expirarii? foloseste formatul YYYY.MM.DD");
                    String expirationDate = sc.next();
                    switch (productType){
                        case ("1"):
                            System.out.println("Temperatura ideala de stocare?");
                            int storageTemp = sc.nextInt();
                            Animal a = new Animal(name, id, price, weight, quantity, expirationDate, storageTemp);
                            ProductList.add(a);
                            a.listProducts();
                            break;
                        case ("2"):
                            System.out.println("Ce vitamine contine? folosteste formatul X, Y, Z,...");
                            String vitaminList = sc.nextLine();
                            Vegetal b = new Vegetal(name, id, price, weight, quantity, expirationDate, vitaminList);
                            ProductList.add(b);
                            b.listProducts();
                            break;
                        default:
                            System.out.println("N-ai introdus o valoare valida, mai incearca");
                    }
                    for (Product product : ProductList) {
                        if (product.id == id) {
                                product.quantity = product.quantity + quantity;
                                // dayCounter++;
                                break;

                        }
                    }

                    Order addOrder = new Order(id, quantity);
                    System.out.println("Data tranzactiei");
                    addOrder.orderDate = sc.next();
                    OrderList.add(addOrder);
                    break;
                case ("2"):
                    for (Product a : ProductList){
                        a.listProducts();
                    }
                    System.out.println("Tasteaza id-ul produsului pe care il vinzi: ");
                    int idProduct = sc.nextInt();
                    System.out.println("Tasteaza cantitatea vanduta: ");
                    boolean productFound = false;
                    int soldQuantity = sc.nextInt();
                    for (Product product : ProductList) {
                         if (product.id == idProduct) {
                             productFound = true;
                             if (product.quantity < soldQuantity) {
                                 System.out.println("Stoc insuficient");
                             } else {
                                 product.quantity = product.quantity - soldQuantity;
                                // dayCounter++;
                                 break;
                             }
                         }
                    }

                    if (!productFound) {
                        System.out.println("Produsul nu este in univers");
                    }
                    Order order = new Order(idProduct, soldQuantity);
                    //Date currentDate = new Date();
                    System.out.println("Data tranzactiei");
                    order.orderDate = sc.next();
                    OrderList.add(order);
                    //ProductList.get();
                    //int idProdus = sc.nextInt();
                    //2Order myOrder = new Order();


                    //myOrder.products.add();
                    break;
                case ("3"):
                    System.out.println("Baga data pentru tranxactiile din ziua respectiva:");
                    String referenceDate = sc.next();
                    for (Order a : OrderList){
                        if (referenceDate.equals(a.orderDate)) {
                            a.listOrders(a.id, a.quantity, referenceDate);
                        }


            }
                    break;
                default:
                    System.out.println("Unavailable option, select one of the valid ones, idiot");
                    break;
            }

            sc.nextLine();

            System.out.println("1. Create product and add it to stock");
            System.out.println("2. Sell product");
            System.out.println("3. Display daily sales and report");
            System.out.println("4. Exit");

            option = sc.next();
            sc.nextLine();
        }
    }
}
