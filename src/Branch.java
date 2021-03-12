

public class Branch {

    private  String name;
    private BranchEmployee[] branchEmployees;
    private int branchEmployeeNumber;

    private Customer[] customers;
    private int numberOfCustomer;

    private Product[] stock;
    private int stockIndex;

    public Branch(String name) {
        this.name = name;
        this.branchEmployees = new BranchEmployee[20];
        this.branchEmployeeNumber = 0;
        this.customers = new Customer[20];
        this.numberOfCustomer = 0;
        this.stock = new Product[20];
        this.stockIndex = 0;
    }

    public int getBranchEmployeeNumber() {
        return branchEmployeeNumber;
    }

    public void setBranchEmployeeNumber(int branchEmployeeNumber) {
        this.branchEmployeeNumber = branchEmployeeNumber;
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

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
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

    public void addBranchEmployee(BranchEmployee branchEmployee){
        branchEmployees[branchEmployeeNumber] = branchEmployee;
        branchEmployeeNumber++;
    }



}
