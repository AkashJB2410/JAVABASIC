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
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = s1.parse(sDate1);
        System.out.println("\n"+date);
    }
    public   static void main2 () throws ParseException {
        System.out.println(sDate1);
        char ch=' ';
        String b = "";
        for (int i = 0; i < sDate1.length() ; i++) {
            char a = sDate1.charAt(i);
            if (sDate1.charAt(i)=='-'&i==10){
                b=b+ch;
            }
            else {
                b=b+a;
            }
        }
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = s1.parse(b);
        System.out.println("\n"+date);
    }
}
