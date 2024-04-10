
package compoundinterestcalculator;

import java.util.Scanner;

 
public class CompoundInterestCalculator {

   
     
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the principal amount");
    double principal = input.nextDouble();
    
    System.out.print("Enter the annual interest rate (in percentage): ");
    double rate = input.nextDouble()/ 100;
    
    System.out.print("Enter the number of compounding periods per year");
    int periods = input.nextInt();
    
    System.out.print("Enter the time in years");
    int time = input.nextInt();
    
    double amount = principal * Math.pow(1 + rate / periods, periods * time);
    
    double compoundInterest = amount - principal;
    
    System.out.println(" The compound interest is: " + compoundInterest);
    
    input.close();
    }
}
   
