public class SalesRep {

    protected String name;
    protected int sales;
    protected int quota;
    protected int revenue;

    public SalesRep(String name, int sales, int quota, int revenue) {
        this.name = name;
        this.sales = sales;
        this.quota = quota;
        this.revenue = revenue;
    }

    public String getName() {
        return name + " has made " + sales + " sales with a quota of " + quota + ". Total revenue is " + revenue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public void setRevenue(int revenue){
        this.revenue = sales * quota;
    }

    public int getRevenue(){
        return revenue;
    }

    public void showList(){
        System.out.println(this.getName());
    }
}
