import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number pls!");
        int number = sc.nextInt();

        if (number >= 2) {
            int i = 2;
            boolean checkPrime = true;
            while (i <= Math.sqrt(number)) {
                if (number % 2 == 0) {
                    checkPrime = false;
                    break;
                }
                i++;
            }
            if (checkPrime) {
                System.out.println(number + " is a prime!");
            } else {
                System.out.println(number + " is not prime!");
            }
        } else {
            System.out.println(number + " is not a prime!");
        }
    }
}
