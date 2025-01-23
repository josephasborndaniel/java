class Account{
    int acc_no;
    String name;
    float amount;

    //initializing the variables
    void insert(int a,String n,float amt)
    {
        acc_no=a;
        name = n;
        amount =amt;
    }

    //deposite
   void deposite(float amt)
   {
    amount = amount+amt;
    System.err.println(+amt+"deposite");
   }

   void withdraw(float amt)
   {
    if(amount<amt)
    {
        System.err.println("insuffecient balance");
    }
    else{
        amount = amount-amt;
        System.err.println(+amt+"withdraw");
    }
   }
   void checkBalance()
   {
    System.out.println("Balance"+amount);
   }

   void display()
   {
    System.out.println(acc_no+" "+name+" "+amount);
   }
  }
  class TestAccount{  
    public static void main(String[] args){  
    Account a1=new Account();  
    a1.insert(832345,"Ankit",1000);  
    a1.display();  
    a1.checkBalance();  
    a1.deposite(40000);  
    a1.checkBalance();  
    a1.withdraw(15000);  
    a1.checkBalance();  
     }
  }