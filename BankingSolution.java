import java.io.*;
class BankingSolution
{
public static void main(String args[])throws IOException
{
BankingAccount ba=new BankingAccount();
ba.check();
}
}

class BankingAccount
{
String customer_name;
int id;
String address;
String ph_no;
int balance;
int last_transaction;

void deposit(int amount)
{
if(amount!=0)
{
balance=balance+amount;
last_transaction=amount;
}
}

void withdrawl(int amount)
{
if(amount!=0)
{
balance=balance-amount;
last_transaction=-amount;
}
}

void lasttransaction()
{
if(last_transaction > 0)
{
System.out.println("Success! Money Deposited! Amount: Rs. "+last_transaction);
}
else if(last_transaction < 0)
{
System.out.println("You Have Widthdrawn Rs. "+Math.abs(last_transaction));
}
else
{
System.out.println("You Have No Transactions!!!");
}
}

void check()throws IOException
{

int choice;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("**********************************");    
System.out.println("Press 1 If You Are An Existing Customer:");
System.out.println("Press 2 If You Are A For New Customer:");
System.out.println("Press 3 If You Want To Log Out:");
System.out.println("**********************************"); 
System.out.println();
System.out.println("Enter Your Choice:");
choice=Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
System.out.println("Enter Your Id:");
int idnumber=Integer.parseInt(br.readLine());
if(idnumber==id)
{
show();
}
else
{
    System.out.println("Sorry No Account Found!");
}
break;
case 2:
System.out.println("Enter Your Name:");
customer_name =br.readLine();
System.out.println("Enter Your ID:");
id =Integer.parseInt(br.readLine());
System.out.println("Enter Your Address:");
address =br.readLine();
System.out.println("Enter Your Phone Number:");
ph_no =br.readLine();
System.out.println();
System.out.println("You Are Successfully Registered");
System.out.println();
System.out.println("Welcome to SDG Bank! Your Details Are Given Below:");
System.out.println("Name Is : "+customer_name);
System.out.println("Your ID Number Is : "+id);
System.out.println("Your Address Is :"+address);
System.out.println("Your Phone Number :"+ph_no);
System.out.println();
System.out.println("Thank You For Registering With Us!!");
break;
case 3:
System.out.println("");
break;
default:
System.out.println("Wrong Choice Inputted! ");
break;
}
}
while(choice!=3);
System.out.println("Thank You For Using Our Services! Have A Good Day. ");
}

void show()throws IOException
{
int i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome "+customer_name);
System.out.println("Id Number is: "+id);
System.out.println("Your Address Is "+address);
System.out.println("Your Phone Number is: "+ph_no);
System.out.print("\n");
System.out.println("Press 1 For Balance Enquiry:");
System.out.println("Press 2 For Depositing Amount:");
System.out.println("Press 3 For Widthrawing Amount:");
System.out.println("Press 4 For Previous transaction:");
System.out.println("Press 5 For Exit!");
System.out.println("\n");
do
{
 
System.out.println("Enter Your Choice For Prociding:");
i=Integer.parseInt(br.readLine());
System.out.println("\n");

switch(i)
{
case 1:
System.out.println("Your Balance Is: "+balance);
System.out.println("\n");
break;
case 2:
System.out.println("Enter Amount To Deposit: ");
int amount=Integer.parseInt(br.readLine());
deposit(amount);
System.out.println("\n");
break;
case 3:
System.out.println("Enter Amount To Withdraw: ");
int amount2=Integer.parseInt(br.readLine());
withdrawl(amount2);
System.out.println("\n");
break;
case 4:
lasttransaction();
System.out.println("\n");
break;
case 5:
System.out.println("........");
break;
default:
System.out.println("Invald Option Please Try Again!!");
break;
}
}
while(i!=5);
System.out.println("Thank You For Using Our Serivces!!!");
}
}
