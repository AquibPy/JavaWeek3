import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques7 {
    public static void main(String[] arg) throws IOException {
        bank b = new bank();
        System.out.println("Enter Your Name:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        b.name = stdin.readLine();
        System.out.println("Enter Your Balance:");
        b.balance = Integer.parseInt(stdin.readLine());
        System.out.println("Enter Your Account Number:");
        b.acc_no = Long.parseLong(stdin.readLine());
        System.out.println("Enter Type of Your Account:");
        b.type = stdin.readLine();
        System.out.println("\n1.Deposit \n2.Withdraw \n3.Details");
        System.out.println("Enter Your Choice!!!");
        int choice = Integer.parseInt(stdin.readLine());
        if(choice == 1){
            b.deposit();
            System.out.println("Dear "+ b.name+",Successfully Credited  in your Account Number " + b.acc_no);
            System.out.println("Your Current Balance is " + b.balance);
        }
        else if(choice == 2)
        {
            b.withdraw();
            System.out.println("Dear "+ b.name+",Successfully Debited in your Account Number " + b.acc_no);
            System.out.println("Your Current Balance is " + b.balance);
        }
        else if(choice == 3)
        {
            b.display();
        }
        else
        {
            System.out.println("Invalid Choice!!!");
        }
    }
}
class bank
{
    public String name;
    public long acc_no;
    public String type;
   public long balance;

    public long deposit() throws IOException
    {
        System.out.println("Enter Amount to be Deposit in Your Account:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        long dep = Long.parseLong(stdin.readLine());
        return balance += dep;
    }
    public long withdraw() throws IOException
    {
        System.out.println("Enter an Amount to be Withdraw: ");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        long with = Long.parseLong(stdin.readLine());
        return balance -= with;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Type: " + type);

    }
}