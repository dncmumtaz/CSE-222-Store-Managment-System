
public class Customer extends Person{

//    private  Product product;

    String[] orders = new String[20];
    int orderNumber;


    String address;
    String telephone;
    public Customer(String id, String name, String surname, String password, String email, Product product, String[] order)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        AutoAssignId();//to create and assign id
        //      this.product = product;
        this.orders = order;
        this.orderNumber = 0;
        this.telephone ="";
        this.address = "";
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

    public void AddOrders(Product product){
        orderNumber++;
        //orders[orderNumber] = product.name;
    }

    public void ShowOrders(){
        //show orders
    }


    public void ShowProductStockBranch(/*product*/){
        //productın brancına eriş
        System.out.println("show product's stock");
    }
    public  void setAddress(String address){
        this.address = address;
    }
    public  void setTelephone(String telephone){
        this.telephone = telephone;
    }

    public void OnlineShoping(){
        System.out.println("enter adress ");
        //take adress and setadress
        System.out.println("enter telephone");
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
