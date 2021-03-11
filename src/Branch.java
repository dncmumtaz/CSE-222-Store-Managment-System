

public class Branch {

    private  String name;
    private BranchEmployee[] branchEmployees;
    private Customer[] customers;


    private Product[] stock;

    private int stockIndex;

    public Branch(String name) {
        this.name = name;
        this.branchEmployees = new BranchEmployee[20];
        this.customers = new Customer[20];
        this.stock = new Product[20];
        this.stockIndex = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BranchEmployee[] getBranchEmployees() {
        return branchEmployees;
    }

    public void setBranchEmployees(BranchEmployee[] branchEmployees) {
        this.branchEmployees = branchEmployees;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Product[] getStock() {
        return stock;
    }

    public int getStockIndex() {
        return stockIndex;
    }

    public void setStockIndex(int stockIndex) {
        this.stockIndex = stockIndex;
    }

}
