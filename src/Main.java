public class Main {

    public static void main(String[] args) {
        // write your code here
        Company company = new Company("LCW");

        company.addAdministrator(new Administrator("1111", "admin1", "admin1surname", "1234", "admin@lcw.com.tr", company));


        company.Test();
        System.out.println(company.getBranches()[2].getName());
        System.out.println(company.getBranches()[0].getBranchEmployees()[0].getName());
    }
}
