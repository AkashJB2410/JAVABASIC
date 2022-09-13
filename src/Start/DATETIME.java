package Start;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class DATETIME {

    public static <DateAndTime> void main(String[] args) throws ParseException {
        System.out.println("DATE AMD TIME");
        String sDate1 = "2022-09-13-18:17:40";
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
        System.out.println(b+"\n"+date);
    }
}
