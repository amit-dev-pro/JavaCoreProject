import java.util.Scanner;
class atm
{
    float balance=90000;
    int pin=6565;
    int amount;

    public void checkPin()
    {
        System.out.println();
        System.out.println(".......WELCOME TO ATM.......");
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println(" YOU ENTER FOUR DIGIT PIN ");
        Scanner sc=new Scanner(System.in);
        pin=sc.nextInt();
        if(pin==6565)
        {
            menu();
        }
        else
        {
            System.out.println("You Enter Invailed Pin number Please Try Again Later");
            checkPin();
        }


    }
    public void menu()
    {
        System.out.println("It's All Your Choice  ");
        System.out.println("...................................");
        System.out.println("1. CHECK THE A/C BALANCE " );
        System.out.println("2. WITHDRAW MONEY  ");
        System.out.println("3. DEPOSITE MONEY ");
        System.out.println("4. EXIT ");

        System.out.println("Please Inter Keys (1 2 3 4 ) For Do Anything Which is Given To Above");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1)
        {
            checkBalance();
        }
        else if(opt==2)
        {
            withdrawMoney();
        }
        else if(opt==3)
        {
            deposityMoney();
        }
        else if(opt==4)
        {
            System.out.println("I HOPE YOU ARE SO HAPPY WITH MY HELP ");

        }
        else
        {
            System.out.println("Please  Enter a Valid Choice ");
        }
    }
    public void checkBalance()
    {
        System.out.println(STR." Total Available Balance in You Bank A/C is  \{balance} /-");
        menu();
    }
    public void withdrawMoney()
    {
        System.out.println("Please Enter  How Much You Withdrow Money in Our Bank A/C  ");
        Scanner sc=new Scanner(System.in);
        amount=sc.nextInt();
        if(amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance=balance-amount;
            System.out.println(STR."\{amount}/-Money Withdraw Successsfully");
            System.out.println(STR." Now YOUR Total Balance is \{balance} /-");
        }
        menu();
    }
    public void deposityMoney()
    {
        System.out.println("Please Enter  How Much You Deposite Money in Our Bank A/C  ");
        Scanner sc=new Scanner(System.in);
        amount=sc.nextInt();
        balance=balance+amount;
        System.out.println(STR."\{amount}/- Deposited Successfully");
        System.out.println(STR." Now YOUR Total Balance is \{balance} /-");
        menu();
    }
}
public class AtmBasedProcess{
    public static void main(String[]args){

        atm obj=new atm();
        obj.checkPin();
        System.out.println("Hii..Ray G Thanks for coding journey");

    }

}
