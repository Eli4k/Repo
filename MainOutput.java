/*
 * ELI ASIOMEY AMEVOR
 */
import java.util.Scanner;
class MainOutput{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		BankAccount data = new BankAccount();

 		System.out.println("Select a number perform an Operation:\n\t1.Desposit\n\t2.Withdrawal\n\t3.Transfer\n\t4. 0 to Exit.\n");
 		int input = userInput.nextInt();
				
			if(input == 1){
			data.deposit();	
			}
		
			if(input == 2){
			data.withdraw();
			}
			if(input == 3){
			data.transfer();
			}					
		}
	}