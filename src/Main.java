public class Main {

    public static void main(String[] args) {
        // write your code here
        Company company = new Company("LCW");

        company.addAdministrator(new Administrator("1111", "admin1", "admin1surname", "1234", "admin@lcw.com.tr", company));


        company.Test();
        System.out.println(company.getBranches()[2].getName());
        System.out.println(company.getBranches()[0].getBranchEmployees()[0].getName() + "   " + company.getBranches()[0].getBranchEmployees()[1].getName());
     //   System.out.println(company.getBranches()[0].getStock()[0].getModel());
        company.getBranches()[0].getBranchEmployees()[0].showStock();
        company.getBranches()[0].getBranchEmployees()[0].makeSales("MDesk1");
        company.getBranches()[0].getBranchEmployees()[0].showStock();

        System.out.println(company.getBranches()[0].getCustomers()[0].getName());
        company.getBranches()[0].getCustomers()[0].searchProduct( company, 0,"MTable1" );
        company.getBranches()[0].getCustomers()[0].showProductList(company, 0);
        company.getBranches()[0].getCustomers()[0].ShowProductStockBranch(company, "MDesk1");
        System.out.println("--------");
        company.getBranches()[0].getCustomers()[0].ShowOrders();
    }
}
