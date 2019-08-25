import java.util.Date;

public class Product {

    protected String name;
    protected int id;
    protected int price;
    protected int weight;
    protected int quantity;
    protected String expirationDate;
    //protected Date expDate;

    public Product(String name, int id, int price, int weight, int quantity, String expirationDate) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public String FormatDate(Date expDate)
    {
        String formattedDate = "";

        formattedDate = expDate.toString();

        return formattedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void listProducts(){
        System.out.print("ID " + getId() + ": " + getName() + ", " + getPrice() + " lei/kg," + " there are " + getQuantity() + " kg left, expires on " + getExpirationDate());
    }

}
