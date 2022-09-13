package Akash;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainProgramm {
    static Scanner sc1 = new Scanner (System.in);
    static String sDate1 = sc1.next();

    public static void main(String[] args) throws ParseException {
        int length = sDate1.length();
        if (length==10) {
            System.out.println("main1");
            main1();
        }else {
            if (length==19) {
                System.out.println("main2");
                main2();
            }
            else {
                System.out.println("InValid Format");
            }
        }
    }

    public  static void main1 () throws ParseException {
        String ch1="-";
        String b ="";
        for (int i = 0; i < sDate1.length() ; i++) {
            char a = sDate1.charAt(i);
            if (a!='/'){
                b=b+a;
            }else {
                b=b+ch1;
            }
            System.out.println(b);
        }
        System.out.println(b);
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = s1.parse(b);
        System.out.println("\n"+date);
    }
    public   static void main2 () throws ParseException{
        System.out.println(sDate1);
        String ch1="-";
        String b ="";
        for (int i = 0; i < sDate1.length() ; i++) {
            char a = sDate1.charAt(i);
            if (a=='-'&i==10){
                b=b+ch1;
            }if (a=='/'){
                b=b+ch1;
            }
            else {
                b=b+a;
            }
        }
        System.out.println(b);
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = s1.parse(b);
        System.out.println("\n"+date);
    }
}
