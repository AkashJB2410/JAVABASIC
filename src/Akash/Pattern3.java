package Akash;

public class Pattern3 {
    public static void main(String[] args) {
        int count = 1 ;
        int z = 1 ;
        int b = 2 ;
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= i; j++) {
//                if ((i > 10) && (j > 9)) {
//                    break;
//                } else

                    if (i == j)  {
                        System.out.print("*" + "\t");
                    }
                    else {
                        if (j==1){
                        System.out.print("*"+ "\t");
                        }
                        else {
                            if (i==10){
                            System.out.print("*"+"\t");
                            }
                            else {
                            System.out.print(count+"\t");
                            count++;
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
