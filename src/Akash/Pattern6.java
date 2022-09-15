package Akash;

public class Pattern6 {
    public static void main(String[] args) {
        int count = 1 ;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
                for (int k = 1; k <=j; k++) {
                        System.out.print(count+"\t");
                        count++;
                }
                for (int k = 1; k <=j; k++) {
                    System.out.print(count+"\t");
                    count++;
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
