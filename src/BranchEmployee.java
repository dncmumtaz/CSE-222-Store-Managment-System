public class BranchEmployee extends CompanyPersonal{

    private Branch branch;


    public BranchEmployee(String id, String name, String surname, String password, String email, Branch branch ){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.branch = branch;
        AutoAssignId();//to create and assign id
    }




    public void  showStock(){
        for(int i = 0; i < branch.getBranchEmployeeNumber()-1; i++)
        {
            System.out.println(branch.getStock()[i].getModel()+ " "+ branch.getStock()[i].getColor()+ " " + branch.getStock()[i].getNumberOfItem());
        }


    }

    public void sendInfoToAdmin(Product product){
        System.out.println("This product should be buy.");
    }

    public void addProduct(Product product){

        branch.getStock()[branch.getStockIndex()] = product;
        branch.setStockIndex(branch.getStockIndex() + 1);

    }

    public  void removeProduct(int index){
      //   Branch tempBranch = new Branch("temp");
      //   tempBranch = branch;

        for(int i = index; i < branch.getStockIndex()-1; i++ )
        {
            branch.getStock()[i] = branch.getStock()[i+1];
        }
        branch.getStock()[branch.getStockIndex()] = null;

     //   branch.getStock()[index] = null;
        branch.setStockIndex(branch.getStockIndex() -1 );
    }

    public void showCustomerInfo(int customerIndex){
        //TODO indexe gore degil musteri numarasına gore gelmesi gerekir
        System.out.println(branch.getCustomers()[customerIndex].getName());
        System.out.println(branch.getCustomers()[customerIndex].getSurname());
        System.out.println(branch.getCustomers()[customerIndex].getEmail());
        System.out.println(branch.getCustomers()[customerIndex].getId());
        System.out.println(branch.getCustomers()[customerIndex].getAddress());
        System.out.println(branch.getCustomers()[customerIndex].getTelephone());
        System.out.println(branch.getCustomers()[customerIndex].getOrders());

    }

    public void addOrderToCustomer(Product product){
        //dogru indexler gonderilmeli
        branch.getCustomers()[0].orders[0] = product.toString();
    }
    public  void updateCustomerOrder(int customerIndex, Product product){
        //?
        int lastIndex = branch.getCustomers()[customerIndex].orders.length +1;
        branch.getCustomers()[customerIndex].orders[lastIndex] = product.toString();
    }

    public void addCustomer(Customer customer){
        int lastIndex = branch.getNumberOfCustomer();
        branch.getCustomers()[lastIndex] = customer;
        branch.setNumberOfCustomer(lastIndex + 1);
    }

    public void makeSales(String productModel){

        for(int i = 0; i < branch.getStockIndex() ; i++)
        {

            if(branch.getStock()[i].getModel().equals(productModel) ){
                branch.getStock()[i].setNumberOfItem(branch.getStock()[i].getNumberOfItem()- 1);
                break;
            }
        }
    }

    //ToDo menu scene

}
/*
Branch employees can inquire about the products in stock,

 inform the manager that the product should be purchased
 when any product is less than the requested amount, add / remove products,
 make sales, access the information of the previous orders
 of a customer by using the customer number and add new order
  to this section. Branch employees should update the customers'
   previous orders section during their sales from the store.
    If the customer is shopping for the first time, then they should create a new subscription.
  */


/**
 *Şube çalışanları,
 * stoktaki ürünleri sorgulayabilir,
 * herhangi bir ürün talep edilen miktardan az olduğunda ürünün satın alınması gerektiğini yöneticiye bildirebilir,
 * ürün ekleyip çıkarabilir,
 * satış yapabilir,
 * Müşteri numarasını kullanarak bir müşterinin önceki siparişlerinin bilgilerine ulaşır ve bu bölüme yeni sipariş ekler.
 *  Şube çalışanları, mağazadan yaptıkları satışlarda müşterilerin önceki siparişler bölümünü güncellemelidir.
 *  Müşteri ilk kez alışveriş yapıyorsa yeni bir abonelik oluşturmalıdır.
 *
 *
 */
