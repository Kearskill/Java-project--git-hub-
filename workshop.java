import java.util.Scanner;

public class workshop{
    public static void main(String [] args){
        LenyanApproach lenyan = new LenyanApproach();
        lenyan.header();
    }    
}
class LenyanApproach{
    //Declare
    String stockName = "";
    double revenue;
    double totalNumShares;
    double dividendYield;
    double currentSharePrice;
    double roe;
    double cashFlow;
    double [] netProfit = new double [2];

    public void header () {
        System.out.println("    Stock's analysis system     ");
        System.out.println("---------------------------------");
    }

    public void getData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the stock name: ");
        stockName = input.nextLine ();
        System.out.print("Enter the current share price: ");
        currentSharePrice = input.nextDouble();
        System.out.print("Enter the totla number of shares: ");
        totalNumShares = input.nextInt();
        System.out.println("Enter revenue: ");
        revenue = input.nextDouble();
        System.out.println("Enter dividend yield: ");
        
    }
}