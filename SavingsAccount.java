

//@author Zakir Faizi
public class SavingsAccount extends BankAccount{
         private double rate=2.5;
         private int savingsNumber=0;
         private String accountNumber;
       public SavingsAccount(String name,double init) {
    	   super(name,init);
    	   accountNumber=super.getAccountNumber()+"-"+savingsNumber;
    	    
       }
       
       public void postInterest() {
    	   double interest=super.getBalance()*((2.5/100)/12);
    	   super.deposit(interest);
    	   
       }
       @Override
       public String getAccountNumber()
   	{
   		return this.accountNumber;
   	}
       //copy
       public SavingsAccount(SavingsAccount newAcc,double init) {
           super(newAcc,init);
           this.accountNumber=newAcc.accountNumber;
           this.savingsNumber=newAcc.savingsNumber;
           newAcc.savingsNumber++;
           accountNumber=newAcc.accountNumber.substring(0,newAcc.accountNumber.length()-1)+newAcc.savingsNumber;
         
       }
         
       
}