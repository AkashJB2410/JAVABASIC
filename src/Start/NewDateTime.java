package Start;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NewDateTime {
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
        System.out.println(sDate1);
        char ch='-';
        String b ="";
        for (int i = 0; i < sDate1.length() ; i++) {
            char a = sDate1.charAt(i);
            if (a=='/'){
                b=b+ch;
            }
            else {
                b=b+a;
            }
        }
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(b);
        Date date = s1.parse(b);
        System.out.println("\n"+date);
    }
    public   static void main2 () throws ParseException {
        System.out.println(sDate1);
        char ch=' ';
        char ch1='-';
        String b = "";
        for (int i = 0; i < sDate1.length() ; i++) {
            char a = sDate1.charAt(i);
            if (a=='-'&i==10){
                b=b+ch;
            }
            else { if (a == '/' & i == 10) {
                b = b + ch;
            }
                else { if (a=='/'){
                        b=b+ch1;
                    } else {
                        b = b + a;
                    }
                }
            }
        }
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(b);
        Date date = s1.parse(b);
        System.out.println("\n"+date);
    }
}
