package Akash;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n =sc1.nextInt();

            int m = 0;
            int count = 0;
            m = n / 2;
            if (n == 0 || n == 1) {
                System.out.println(n + " is not prime number");
            } else {
                for (int i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        System.out.println(n + " is not prime number");
                        count = 1;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println(n + " is prime number");
                }
            }
    }
}
