
import java.util.Scanner;

public class BabylonianAlgorithm
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pick a number: ");
        double n = keyboard.nextDouble();
        double guess = n / 2.0;
        double last;
/*
        for (int i = 0; i < 5; i++)
        {
            double r = n / guess;
            guess = (guess + r)/2.0;
        }
*/
        while (true)
        {
            last = guess;
            double r = n / guess;
            guess = (guess + r) / 2.0;
            if ((guess/last >= .99) && (guess/last <= 1.0))
                break;
       }
        System.out.println(n);
        System.out.printf("Square Root: %.2f",guess);

    }
}
