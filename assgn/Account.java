//Create a class Account with the attributes accountNo – int, accountType – String,
// accountBalance – int and methods setAccountDetails() which set the values to these attributes
// withdraw() which subtracts the given amount from the available balance,
// deposit() which adds given amount to the available balance and dispAccountDetails()
// which displays accountNo, accountType, accountBalance. Create a class Main1 which
//  contains main() method to test the functionality of Account class.
public class Account {

      private  int accountNo=32323;
      private  String accountType="test1";
      private  int accountBalance=3832;

    Account () {
        accountNo =this.accountNo;
        accountType=this.accountType;
        accountBalance=this.accountBalance;
    }
    public void setAccountDetails(int accno,String acctype, int accbal)
    {
        this.accountNo =accno;
        this.accountType=acctype;
        this.accountBalance=accbal;
        System.out.println(this.accountNo);
        System.out.println(this.accountType);
        System.out.println(this.accountBalance);
    }
    public void withdraw(int withdrawAmt)
    {
        this.accountBalance=this.accountBalance-withdrawAmt;
        System.out.println(this.accountBalance);
    }
    public void deposit(int depAmt)
    {
        this.accountBalance=this.accountBalance-depAmt;
        System.out.println(this.accountBalance);

    }

    public void dispAccountDetails()
    {
            System.out.println("account no ="+accountNo);
            System.out.println("account type ="+accountType);
            System.out.println("account balance ="+accountBalance);
    }
}
