import java.util.Scanner;

public class Q7F {


        public static void main(String[] args) {
            int num = 0;
            System.out.println("Enter the number: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            scanner.close();

            long factorial = multiplyNumbers(num);
            System.out.println("Factorial of " + num + " = " + factorial);
        }
        public static long multiplyNumbers(int num)
        {
            if (num >= 1)
                return num * multiplyNumbers(num - 1);
            else
                return 1;
        }

}
