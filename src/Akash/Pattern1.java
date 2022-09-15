package Akash;

public class Pattern1 {
    public static void main(String[] args) {
        int num = 1 ;
        for (int m = 1; m <= 1; m++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (j == 1) {
                        System.out.print("*" + "\t");
                    } else {
                        if (j == 5) {
                            System.out.print("*" + "\t");
                        } else {
                            System.out.print(num + "\t");
                            num++;
                        }
                    }
                }
                System.out.println();
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*" + "\t");
            }
        }
    }
}
