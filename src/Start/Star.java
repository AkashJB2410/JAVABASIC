package Start;

public class Star {
    public static void main(String[] args) {
        for (int k = 0; k <= 5; k++) {
            for (int i = 0; i < 6 ; i++) {
                for (int j = 5; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <=i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
