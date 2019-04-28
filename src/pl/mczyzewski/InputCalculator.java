package pl.mczyzewski;

import java.util.Scanner;

public class InputCalculator
{
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int count =0, sum=0 ,number;
        double avr;
        do{
            if(scanner.hasNextInt())
            {
                number=scanner.nextInt();
                sum+= number;
                count++;
                scanner.nextLine();
            }else{
                break;
            }

        }
        while (true);
        avr = (double) sum/count;
        System.out.println(("SUM = " + sum + " AVG = " + Math.round(avr)));

    }
}


