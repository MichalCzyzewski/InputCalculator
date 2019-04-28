package pl.mczyzewski;

import java.util.Scanner;

public class InputCalculator
{
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int count =0, sum=0 ;
        double avr;

        while (true)
        {
            boolean isInt = scanner.hasNextInt();
            if (isInt)
            {
                sum += scanner.nextInt();
                count++;
                scanner.nextLine();

            }
            else
            {
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(avr = (double) sum/(double) count));
    }
}


