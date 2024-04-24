
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define constants
        final byte YEAR_MONTHS = 12;
        final byte PERCENT = 100;
                 //get data from user
            Scanner scanner =new Scanner(System.in);

            System.out.println("Principal: ");
            int principal =scanner.nextInt();

            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            float monthlyInterest=annualInterest/PERCENT/YEAR_MONTHS;

            System.out.print("Period(Years):");
            byte years= scanner.nextByte();
            int numberOfPayments = years*YEAR_MONTHS;
                  //calculate mortgage
            double mortgage = principal
                    * (monthlyInterest *Math.pow(1+monthlyInterest,numberOfPayments))
                    / (Math.pow(1+monthlyInterest,numberOfPayments)-1);

                //display mortgage
            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: "+ mortgageFormatted);


    }
}
