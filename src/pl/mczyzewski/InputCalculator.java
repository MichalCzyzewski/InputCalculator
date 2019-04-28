package pl.mczyzewski;

import java.util.Scanner;

public class InputCalculator
{
    public static void inputThenPrintSumAndAverage()
    {
        int number = 0;
        int sum = 0;
        long avarage = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            boolean isInt = scanner.hasNextInt();
            if (isInt)
            {
                number = scanner.nextInt();

                if(number>0)
                {
                    sum+=number;
                    count++;
                }
            }else
            {   double allSume = sum/count;
                avarage = Math.round(allSume);

                System.out.println("SUM =" + sum+ " AVG = "+ avarage);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}

