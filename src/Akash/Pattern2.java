package Akash;

public class Pattern2 {
    public static void main(String[] args) {
//        int
        for (int i = 1; i <=5 ; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" "+"\t");
            }
            for (int j = 1; j <=i ; j++) {
                    System.out.print("*"+"\t \t");
                }
            System.out.println();
        }
        }
}
