  import java.util.Scanner;
  public class ATM{
    public static void main(String[] args) {
		
        Scanner obj = new Scanner(System.in);
		System.out.print("enter a name:");
		String name = obj.nextLine();
		System.out.print("enter a phone_number:");
		String phone_number = obj.nextLine();
		System.out.print("enter a password:");
		int password = obj.nextInt();
		
		
		if( password==2114)
		{
		   System.out.print(" Welcome " + name );
		   while (true)
		 {
			
			System.out.print(" enter the option:1.deposit,2.withdraw,3.balanceenquiry,4.exit: ");
			int option = obj.nextInt();
			int balance = 50000;
            switch(option)
			{
				case 1:
				    System.out.print("enter the deposit amount:");
					int deposit=obj.nextInt();
				    balance=deposit+balance;
					System.out.println("Available balance:" + balance);
					break;
				
				case 2:
				    System.out.print("enter the withdrawal amount:");
					int withdraw_amount = obj.nextInt();
					if(withdraw_amount<=balance){
				    balance= balance-withdraw_amount;
					System.out.println("Available balance:" + balance);}
					else{
						System.out.println("insufficient balance");
					}
					break;
				
				case 3:
				    System.out.println("available balance:" + balance);
					break;
					
		        case 4:
				    System.out.println("thanks for using the service");
					System.exit(0);
				
				default:
				    System.out.println("invalid option");
					break;
			}	
			
		  }
		  
		
		}
			else{
			  System.out.println("invalid password");
		      }
				
			
		
		
		
				   
					
        
    }
	
}
