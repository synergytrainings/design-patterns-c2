package composite;

/**
 * Created by Luiza.Karapetyan on 6/19/2015.
 */
public class Company {

    public static void main(String a[]){

        Engineer eng1 = new Engineer(100, "Tigran", "Engineering");
        Engineer eng2 = new Engineer(101, "Arman", "Engineering");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(eng1);
        engDirectory.addEmployee(eng2);

        Accountant acc1 = new Accountant(200, "Aida", "Accounts");
        Accountant acc2 = new Accountant(201, "Maria", "Accounts");
        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(acc1);
        accDirectory.addEmployee(acc2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}
