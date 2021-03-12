import java.util.Scanner;

public class Customer extends Person{

//    private  Product product;

    String[] orders ;
    int orderNumber;


    String address;
    String telephone;
    public Customer(String id, String name, String surname, String password, String email)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        AutoAssignId();//to create and assign id
        //      this.product = product;
        this.orders = new String[20];
        this.orderNumber = 0;
        this.telephone = null;
        this.address = null;
    }

    public String[] getOrders() {
        return orders;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }



   /* public Product getProduct(){
        return product;
    }*/
    public void searchProduct(Company company, int branchIndex, String productName){
        company.getBranches()[branchIndex].getStock();
        for (int i = 0; i <  company.getBranches()[branchIndex].getStockIndex()+ 1; i++){
            if(company.getBranches()[branchIndex].getStock()[i].getModel().equals(productName))
                System.out.println("this product is available and there is " + company.getBranches()[branchIndex].getStock()[i].getNumberOfItem());
        }
    }

    public void showProductList(Company company, int branchIndex){
        int numOfStock = company.getBranches()[branchIndex].getStockIndex();
        System.out.println("Products are:");
        for (int i = 0; i < numOfStock + 1; i++)
        {
            System.out.println(company.getBranches()[branchIndex].getStock()[i].getModel() + " "
            + company.getBranches()[branchIndex].getStock()[i].getColor() + " "
            + company.getBranches()[branchIndex].getStock()[i].getNumberOfItem()
            );
        }
    }

    public void AddOrders(Product product){
        orderNumber++;
        //orders[orderNumber] = product.name;
    }

    public void ShowOrders(){
        //show orders
    }


    public void ShowProductStockBranch(Company company, String nameOfProduct){
        int numOfBranch = company.getBranchNumber();


        for (int i = 0; i < numOfBranch; i++)
        {
            int numOfStock = company.getBranches()[i].getStockIndex();
            if(numOfStock == 0) continue;
            for(int j = 0 ; j < numOfStock +1 ; j++) {
                if (company.getBranches()[i].getStock()[j].getModel().equals(nameOfProduct)) {
                    System.out.println("meyabaaaa");
                    System.out.println("the product is available in " + company.getBranches()[i].getName());
                }
            }
        }

    }

    public  void setAddress(String address){
        this.address = address;
    }
    public  void setTelephone(String telephone){
        this.telephone = telephone;
    }

    public void OnlineShoping(){
//        Scanner input = new Scanner(System.in);
 //       address = input.nextLine();
        System.out.println("enter adress ");
        //take adress and setadress
        System.out.println("enter telephone");
   //     telephone = input.nextLine();
        //take telephone and set telephone


        //make online shoping so call the addoder
    }

    public void  makeShoping(){}


    //Müşteri sisteme giriş yaptığında ürün arayabilir,
// ürün listesini görebilir, bir ürünün hangi mağazada olduğunu görebilir,
// adres ve telefon bilgilerini girerek online alışveriş yapabilir ve önceki siparişlerini görüntüleyebilir.
    @Override
    public void menu()
    {

    }
}
/*
 *ürün listesini görebilir,
 *bir ürünün hangi mağazada olduğunu görebilir,
 *adres ve telefon bilgilerini girerek online alışveriş yapabilir ve
 *önceki siparişlerini görüntüleyebilir.
 *
 */