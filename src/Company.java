
public class Company {

    private String name;
    private Administrator[] administrators ;
    private  Branch[] branches;
    private int branchNumber;



    private  int adminNumber;

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
    public void Test()
    {

        administrators[0].addBranch(new Branch("FirstBranch"));
        administrators[0].addBranch(new Branch("SecondBranch"));
        administrators[0].addBranch(new Branch("ThirdBranch"));
        administrators[0].addBranch(new Branch("FourdBranch"));
        //administrators[0].addBranchEmployee(new BranchEmployee());
        administrators[0].addBranchEmployee(0, new BranchEmployee("101","1stEmployeeName","1stEmployeeSurname","emp111", "emp11@xx.com", getBranches()[0]));

    }

}