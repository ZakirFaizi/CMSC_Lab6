//@author Zakir Faizi

public class CheckingAccount extends BankAccount{
     private static double FEE=0.15;
     
     public CheckingAccount(String name, double init){
    	super(name,init); 
    	super.setAccountNumber(super.getAccountNumber()+"-10");
    	 
     }
     
     @Override
     public boolean withdraw(double amount)
 	{
 	
        double total=amount+FEE;
 		return super.withdraw(total);
 	}
     
     
   
}