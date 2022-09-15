package Akash;

import java.util.Scanner;

public class sssss {

    static String convert(String str) {


        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && ch[i] != ' ' ||ch[i] != ' ' && ch[i - 1] == ' ') if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char)(ch[i] - 'a' + 'A');
            }
            else
                if (ch[i] >= 'A' && ch[i] <= 'Z'){
                    ch[i] = (char)(ch[i] + 'a' - 'A');
                }
        }
        String st = new String(ch);
        return st;
    }
    public static void main(String[] args){
        System.out.println("Enter Your String");
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String str =A.toLowerCase();
        System.out.println(convert(str));

    }

}
