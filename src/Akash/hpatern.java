package Akash;

public class hpatern {
    public static void main(String[] args) {
        int count = 1 ;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+"\t");
                count++;
            }
            for (int j = 4; j >=i ; j--) {
                System.out.print(" "+"\t");
            }
            for (int j = 9; j>=i+5 ; j--) {
                System.out.print(" "+"\t");
            }
            for (int j = 1; j<=i ; j++) {
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
        for (int i = 4; i >=0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+"\t");
                count++;
            }
            for (int j = 4; j >=i ; j--) {
                System.out.print(" "+"\t");
            }
            for (int j = 9; j>=i+5 ; j--) {
                System.out.print(" "+"\t");
            }
            for (int j = 1; j<=i ; j++) {
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
