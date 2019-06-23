package ch02pc15;

/**
 *
 * @author frank.olson
 * date: 11/1/2017
 */
public class Ch02pc15 {

    public static void main(String[] args) {
    
        //variables
        double stockAmount = 600;
        double stockPrice = 21.77;
        double stockCost;
        double commission = 0.02;
        double commissionCost;
        double totalPaid;
        
        //calculations
        stockCost = stockAmount * stockPrice;
        commissionCost = stockCost * commission;
        totalPaid = stockCost + commissionCost;
        
        //display amount paid for Stock, amount of commission, total amount paid
        System.out.println("Number of shares purchased: " + stockAmount);
        System.out.println("Price of individual shares purchased: " + stockPrice);
        System.out.println("Cost of shares purchased: " + stockCost);
        System.out.println("Commission amount: " + commissionCost);
        System.out.println("Total amount paid: " + totalPaid);

    }
    
}
