import java.util.Scanner;

public class Company {

    private String name;
    private Administrator[] administrators ;
    private  int adminNumber;

    private  Branch[] branches;
    private int branchNumber;





    public Company(String name) {
        this.name = name;
        this.administrators  = new Administrator[20];
        this.branches = new Branch[20];
        this.branchNumber = 0;
        this.adminNumber = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Administrator[] getAdministrators() {
        return administrators;
    }

    public void setAdministrators(Administrator[] administrators) {
        this.administrators = administrators;
    }

    public Branch[] getBranches() {
        return branches;
    }

    public void setBranches(Branch[] branches) {
        this.branches = branches;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void addBranch(Branch branch ){
        branches[branchNumber] = branch;
        branchNumber++;
    }
    public void removeBranch(int num ){
        branches[num]  = null;
    }

    public void addAdministrator(Administrator administrator){

        administrators[adminNumber] = administrator;
        this.adminNumber++;
    }




    public  void start(){

    }
    public void LoginScreen(){}

    public void startTheSystem() {
        Scanner input = new Scanner(System.in);
        int choice = 3;
        while(choice != 0){
            System.out.println("\nWelcome to Automation System");
            System.out.println(getName() + " Company");
            System.out.println("(1) Personal Login");
            System.out.println("(2) Customer Login");
            System.out.println("(0) Exit");
            System.out.print("Choice: ");
            try{
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("\nYour choice must be an integer value !");
                input.nextLine();
            }
            if(choice == 1){
                PersonalLogin();
            }else if(choice == 2){
                //cargoInquiry();
            }else if(choice == 0){
                System.out.println("System is shutting down..");
            }else{
                System.out.println("\nPlease Try Again\n");
            }
        }
    }

    public void PersonalLogin(){
        boolean permisson = false;
        Scanner input = new Scanner(System.in);
        System.out.println("You are in Personel Page");

        while (!permisson)
        {
            System.out.println("Enter your ID");
            String personID = input.next();
            System.out.println("Enter your password");
            String personPassword  = input.next();


            for (int i = 0; i < adminNumber ; i++) {
                System.out.println("meyabaaaa");
                System.out.println(getAdministrators()[i].getId()+ "*****" + getAdministrators()[i].getPassword());
                if (personID.equals(getAdministrators()[i].getId())  &&
                        personPassword.equals(getAdministrators()[i].getPassword())  ){
                    System.out.println("Access Granted\n");
                    System.out.println("Welcome " + getAdministrators()[i].getName());
                    administrators[i].menu();
                    permisson = true;
                    break;
                }
            }

        }
    }

    public void Test()
    {

        administrators[0].addBranch(new Branch("FirstBranch"));
        administrators[0].addBranch(new Branch("SecondBranch"));
        administrators[0].addBranch(new Branch("ThirdBranch"));
        administrators[0].addBranch(new Branch("FourdBranch"));
        //administrators[0].addBranchEmployee(new BranchEmployee());
        administrators[0].addBranchEmployee(0, new BranchEmployee("101","1stEmployeeName","1stEmployeeSurname","emp111", "emp111@xx.com", getBranches()[0]));
        administrators[0].addBranchEmployee(0, new BranchEmployee("102","2ndEmployeeName","2ndEmployeeSurname","emp112", "emp112@xx.com", getBranches()[0]));
        administrators[0].addBranchEmployee(0, new BranchEmployee("103","3rdEmployeeName","3rdEmployeeSurname","emp113", "emp113@xx.com", getBranches()[0]));
        branches[0].getBranchEmployees()[0].addProduct(new MeetingDesk("MDesk1","red", 3) );
        branches[0].getBranchEmployees()[0].addProduct(new MeetingTable("MTable1","purple", 3) );
        branches[0].getBranchEmployees()[0].removeProduct(1);

        branches[0].getBranchEmployees()[0].addCustomer(new Customer("C111", "C1Name", "C1Surname", "C1Password", "xx"));
        branches[0].getCustomers()[0].OnlineShoping(new OfficeChair("OChair1","red",1) );
        branches[0].getCustomers()[0].OnlineShoping(new OfficeChair("OChair2","red",1) );

    }

}