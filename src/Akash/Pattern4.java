package Akash;

public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                if (j==1||j==10||i==1||i==10||i==j||(j==9&i==2)||(j==8&i==3)||(j==7&i==4)||(j==6&i==5)||(j==5&i==6)||(j==4&i==7)||(j==3&i==8)||(j==2&i==9)){
                System.out.print("*"+"\t");
                }
                else {
                        System.out.print(" "+"\t");
                }
            }
            System.out.println();
        }
    }
}
