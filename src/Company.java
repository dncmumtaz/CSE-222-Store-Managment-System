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

     //   branches[num]  = null;
        int i = num +1 ;
        for ( i = num; i < branchNumber; i++){
            if(i == branchNumber-1){
                branches[i] = null;
                break;
            }
            branches[i] = branches[i+1];
        }
        branchNumber--;

    }

    public void addAdministrator(Administrator administrator){

        administrators[adminNumber] = administrator;
        this.adminNumber++;
    }

    public void chechProductInBranchs(String model){
        //System.out.println("jem ici");
        for (int i = 0; i < branchNumber; i++){
            //System.out.println("jem isi");
            for(int j = 0; j < branches[i].getStockIndex(); j++)
                if(model.equals(branches[i].getStock()[j].getModel())){
                    System.out.println(model + " is availible in" + branches[i].getName());
                }
        }
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
                custemerLogin();
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

              //  System.out.println(getAdministrators()[i].getId()+ "*****" + getAdministrators()[i].getPassword());
                if (personID.equals(getAdministrators()[i].getId())  &&
                        personPassword.equals(getAdministrators()[i].getPassword())  ){
                    System.out.println("Access Granted\n");
                    System.out.println("Welcome " + getAdministrators()[i].getName());
                    administrators[i].menu();
                    permisson = true;
                    break;
                }
            }
            if (!permisson){
                for (Branch branch : branches) {
                    if(branch == null) continue;
                    for (int j = 0; j < branch.getBranchEmployeeNumber(); j++) {
                        if (personID.compareTo(branch.getBranchEmployees()[j].getId()) == 0 &&
                                personPassword.compareTo(branch.getBranchEmployees()[j].getPassword()) == 0) {
                            System.out.println("Access Granted\n");
                            System.out.println("Welcome " + branch.getBranchEmployees()[j].getName());
                            branch.getBranchEmployees()[j].menu();
                            permisson = true;
                            break;
                        }
                    }
                }
            }

        }
    }

    public void custemerLogin(){
        boolean permisson = false;
        Scanner input = new Scanner(System.in);
        System.out.println("You are in Custormer Page");

        while (!permisson){
            System.out.println("Enter your ID");
            String personID = input.next();
            System.out.println("Enter your password");
            String personPassword  = input.next();

            for(int j = 0; j < branchNumber; j++){
                if(branches[j] == null ) continue;

                for (int i = 0; i < branches[j].getNumberOfCustomer(); i++){
                    System.out.println(branches[j].getCustomers()[i].getId() + "------" + branches[j].getCustomers()[i].getPassword());
                    if(personID.equals(branches[j].getCustomers()[i].getId())  && personPassword.equals(branches[j].getCustomers()[i].getPassword() )){
                        System.out.println("Access Granted\n");
                        System.out.println("Welcome " + branches[j].getCustomers()[i].getName());

                        Scanner input4 = new Scanner(System.in);
                        boolean exit = false;
                        int permission1;
                        while (!exit) {
                            System.out.println("Customer Menu");
                            System.out.println("(1)Show the product list");
                            System.out.println("(2)Show Products branchs ");
                            System.out.println("(3)make shopping");
                            System.out.println("(4)show orders");
                            System.out.println("(0)exit");
                            try {
                                permission1 = input4.nextInt();
                            }
                            catch (Exception e) {
                                System.out.println("\nYour choice must be an integer value !");
                                input4.nextLine();
                                permission1 = -1;
                            }

                            switch (permission1) {
                                case 1:
                                    branches[0].showProductList();
                                    break;
                                case 2:
//                                    branches[0].getCustomers()[0].ShowProductStockBranch();
                                     break;
                                case 3:
                                    branches[0].getCustomers()[0].makeShoping(new OfficeDesk("newmodel","black", 3));
                                    System.out.println("the product added");
                                    System.out.println();
                                    break;
                                case 4:
                                    branches[0].getCustomers()[0].ShowOrders();
                                    System.out.println();
                                    break;
                                case 0:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Please Try Again\n");
                            }

                        }
                    }
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
        administrators[0].addBranchEmployee(0, new BranchEmployee("11","1stEmployeeName","1stEmployeeSurname","1", "emp111@xx.com", getBranches()[0]));
        administrators[0].addBranchEmployee(0, new BranchEmployee("102","2ndEmployeeName","2ndEmployeeSurname","emp112", "emp112@xx.com", getBranches()[0]));
        administrators[0].addBranchEmployee(0, new BranchEmployee("103","3rdEmployeeName","3rdEmployeeSurname","emp113", "emp113@xx.com", getBranches()[0]));
        branches[0].getBranchEmployees()[0].addProduct(new MeetingDesk("MDesk1","red", 3) );
        branches[0].getBranchEmployees()[0].addProduct(new MeetingTable("MTable1","purple", 3) );
        branches[0].getBranchEmployees()[0].removeProduct(1);

        branches[0].getBranchEmployees()[0].addCustomer(new Customer("c1", "C1Name", "c1", "c1", "xx"));
        branches[0].getCustomers()[0].OnlineShoping(new OfficeChair("OChair1","red",1) );
        branches[0].getCustomers()[0].OnlineShoping(new OfficeChair("OChair2","red",1) );

    }

}