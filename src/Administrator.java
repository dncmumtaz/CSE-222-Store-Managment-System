import java.util.Scanner;

public class Administrator extends  CompanyPersonal{
    private Company company;

    public Administrator(String id, String name, String surname, String password, String email, Company company ){

        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.company = company;
        AutoAssignId();//to create and assign id

    }


    //branch process
    public void addBranch(Branch branch){
        company.addBranch(branch);
    }

    public void removeBranch(int index){
        company.removeBranch(index);
    }

    public void addBranchEmployee(int branchIndex, BranchEmployee branchEmployee){

        company.getBranches()[branchIndex].addBranchEmployee(branchEmployee);
    }

    public void removeBranchEmployee(int branchIndex, int branchEmployeeIndex, BranchEmployee branchEmployee){
        company.getBranches()[branchIndex].getBranchEmployees()[branchEmployeeIndex] = null;
    }

    public void removeBranchEmployee(){}

}