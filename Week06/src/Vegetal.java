public class Vegetal extends Product {

    protected String vitaminList;

    public Vegetal(String name, int id, int price, int weight, int quantity, String expirationDate, String vitaminList) {
        super(name, id, price, weight, quantity, expirationDate);
        this.vitaminList = vitaminList;
    }

    public String getVitaminList() {
        return "contains vitamins " + vitaminList;
    }

    public void setVitaminList(String vitaminList) {
        this.vitaminList = vitaminList;
    }

    public void listProducts(){
        super.listProducts();
        System.out.print(", ");
        System.out.println(this.getVitaminList());
    }
}
