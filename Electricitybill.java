import java.util.Scanner;
public class Electricitybill {
   

    public static int getRate(int consumerType, int unitRange) {
        if (consumerType == 1) { 
            if (unitRange == 1) return 2;
            else if (unitRange == 2) return 3;
            else return 5;
        } else if (consumerType == 2) {
            if (unitRange == 1) return 5;
            else if (unitRange == 2) return 7;
            else return 10;
        }
        return 0;
    }

    
    public static double calculateBill(int consumerType, int units) {
        double bill = 0;

        if (units <= 100){
            bill = units*getRate(consumerType, 1);
        }
        else if (units <= 200){
            bill = (100*getRate(consumerType, 1)) + (units-100)*getRate(consumerType, 2);
        }
        else{
            bill = (100*getRate(consumerType, 1)) + (100*getRate(consumerType, 2)) +  (units-200)*getRate(consumerType, 3);    
         }
        return bill;
    }

    
    public static void displayBill(int consumerId, int units, double amount) {
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Consumer ID     : " + consumerId);
        System.out.println("Units Consumed  : " + units);
        System.out.println("Total Amount    : ₹" + amount);
        System.out.println("-----------------------------\n");
    }

    public static void main(String[] args) {

        Scanner sha = new Scanner(System.in);

        while (true) {

            System.out.print("Enter Consumer ID: ");
            int consumerId = sha.nextInt();

            System.out.print("Enter Consumer Type (1-Domestic, 2-Commercial): ");
            int consumerType = sha.nextInt();

            if (consumerType != 1 && consumerType != 2) {
                System.out.println("Invalid Consumer Type! Skipping...\n");
                continue;
            }

            System.out.print("Enter Units Consumed: ");
            int units = sha.nextInt();

            if (units <= 0) {
                System.out.println("Invalid Units! Skipping...\n");
                continue;
            }

            double billAmount = calculateBill(consumerType, units);
            displayBill(consumerId, units, billAmount);

            System.out.print("Do you want to continue? (Y/N): ");
            char choice = sha.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                break;
            }
        }

        sha.close();
        System.out.println("\n Thanks for using our Service....Have a Nice day!!");
    }
}

