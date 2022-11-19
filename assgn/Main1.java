import java.util.Scanner;

public class Main1 {
    public static void main(String args[])
    {
        System.out.println("select one option from the following");
        System.out.println("1 - set account details");
        System.out.println("2 - withdraw ");
        System.out.println("3 - deposit");
        System.out.println("4 - dispAccountDetails");

        Scanner sc=new Scanner(System.in);
        int opt =sc.nextInt();

        Account act= new Account();
        if(opt==1)
            act.setAccountDetails(212,"test2",5000);
        else if(opt==2)
            act.withdraw(200);
        else if(opt==3)
            act.deposit(300);
        else if(opt==4)
            act.dispAccountDetails();
        else
            System.out.println("invalid selection");

    }
}
