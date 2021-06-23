import java.util.Scanner;

public class Q6 {

        public static boolean checkPalindrome(int n){
            int r,sum=0,temp;
            boolean res = false;
            temp=n;

            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum) {
                System.out.println("palindrome number ");
                res = true;
            }
            else {
                System.out.println("not palindrome");
            }
            return res;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();
        System.out.println(checkPalindrome(number));
    }

}
