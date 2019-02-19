import java.util.Scanner;
/*
 * ELI ASIOMEY AMEVOR
 */
class BankAccount{
	Scanner data = new Scanner(System.in);
	
	private double amount;
	//public String name;
	private double init_bal;

	public BankAccount(){
		init_bal = 15000;
		amount = 0;
	}
	
	public void youCannotBeInDebt(){
		System.out.println("You Can Not Be in Debt");
	}

	public void deposit(){
			System.out.print("Enter Amount in Figures: ");
			 amount = data.nextDouble();
			if(amount > 0){
				System.out.print("You desopisted: "+amount);
				init_bal+= amount;
				System.out.println("Your Remaining Balance: "+init_bal);
			}
		}

	public void withdraw(){
		System.out.print("Enter Amount in Figures: ");	
		amount = data.nextDouble();	
		if(amount > init_bal){
			System.out.println("You have Insuffecient funds! Please top-up your account.");
		}else{
			init_bal += init_bal - amount;	
			System.out.println("Your Remaining Balance: GHC"+init_bal+".00");
		}
	}

	public void transfer(){
			System.out.print("Enter Receiver Name: ");
				String name = data.nextLine();
				
			System.out.print("Enter Account Number: ");
				String accNo = data.nextLine();
				
			System.out.print("Enter Amount: ");
				double amount = data.nextDouble();

			if(amount > init_bal){
				System.out.println("You have Insufficient funds to perform this operation");
				System.out.println("\nYour Initial Balance is: GHC"+init_bal+".00");
			}else{
				System.out.print(amount+" has been transferred to "+name+"\n Account Number:"+accNo);
				init_bal+= init_bal - amount;
				System.out.print("\nCurrent Balance: GHC"+init_bal+".00");
			}
		}
}


	
		