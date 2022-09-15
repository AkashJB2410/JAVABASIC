package Akash;

import java.time.LocalTime;

public class LOOPTEST {
    public static void main(String[] args) {
        int i = 1 ;
        LocalTime time1 = LocalTime.now();
        for ( i = 1; i <= 10000000; i++) {
            System.out.print(i+"\t");
        }

        LocalTime time2 = LocalTime.now();

        LocalTime time3 = LocalTime.now();

             i = 1;
            while (i <= 10000000){
                i++;
            System.out.print(i+"\t");}

        LocalTime time4 = LocalTime.now();

        System.out.println("");
        System.out.println("TIME");
        System.out.println(time1+"\t for start");
        System.out.println(time2+"\t for end");
        System.out.println(time3+"\t while start");
        System.out.println(time4+"\t while end");

    }
}
