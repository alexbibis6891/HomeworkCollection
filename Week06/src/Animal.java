public class Animal extends Product {

    protected int storageTemp;

    public Animal(String name, int id, int price, int weight, int quantity, String expirationDate, int storageTemp) {
        super(name, id, price, weight, quantity, expirationDate);
        this.storageTemp = storageTemp;
    }

    public int getStorageTemp() {
        return storageTemp;
    }

    public void setStorageTemp(int storageTemp) {
        this.storageTemp = storageTemp;
    }

    public void listProducts(){
        super.listProducts();
        System.out.print(", ideal storage temperature: ");
        System.out.println(this.getStorageTemp() + " degrees");
    }
}
