package Akash;

import java.util.Scanner;

public class StringPR {
    public static void main(String[] args) {
//        String Pr = "techjivaa india ptv ltd";
//        char a [] = Pr.toCharArray();
//        for (int i = 0; i < Pr.length(); i++) {
//            if (i==0 && a[i]!=' '&& a[i]!=' '|| a[i]!=' '&& a[i-1]==0 ) if (a[i] >= 'a' && a[i] <= 'z'){
//                a[i] = (char)(a[i] - 'a' + 'A');
//            }  else
//            if (a[i] >= 'A' && a[i] <= 'Z'){
//                a[i] = (char)(a[i] + 'a' - 'A');
//            }
//        }
//        String st = new String(a);
//        System.out.println(st);
//        char [] a = Pr.toCharArray();
//        System.out.println(a);

//        for (int i = 0; i < a[i]; i++) {
//            if (i==0){
//                System.out.print(a);
//            }else {
//                System.out.print(a);
//            }
//        }
//        Pr.startsWith(Pr.toLowerCase());
//        Pr.toUpperCase();
//        System.out.println(Pr.toUpperCase());
//        char[]a = {};
//        Pr=Pr.toUpperCase();
//        System.out.println(Pr);
//        for (int i = 0; i < Pr.length(); i++) {
//            char a = Pr.charAt(i);
//                if((a >= 'a') & (a >= 'z')||(a >= 'a') && (Pr.indexOf(i)== 0)) {
//                    a = (char) (a - 32);
//                    System.out.print(a);
//                }
//                else  {
//                    if((a >= 'a') && (Pr.indexOf(i)== 0)) {
//                        a = (char) (a - 32);
//                        System.out.print(a);
//                    }
//                    else {
//                    if (a == ' ') {
//                        System.out.print("\n");
//                    }else {
//                        System.out.print(a);
//                    }
//                    }
//                }
//        }
//            for (int i = 0; i < Pr.length(); i++) {
//                char b = Pr.charAt(i);
//                if (i == 0) {
//                    b = (char) (b - 32);
//                    System.out.print(b);
//
//                } else {
//                    if (b >= 'a' && b <= 'z') {
//                        b = (char) (b - 32);
//                        System.out.print(b);
//                    } else {
//                        System.out.print(b);
//                    if (b>='a'&& b<='z'){
//                        b = (char) (b - 32);
//                        System.out.print(b);
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < Pr.length() ; i++) {
//            for (int j = 0; j < i+1 ; j++) {
//                char a = Pr.charAt(j);
//                if (i==j){
//                    System.out.print(a);
//                }else {
//                    System.out.print(a);
//                }
//            }
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String name =sc.nextLine();
        name=name.toLowerCase();
        int k;
        String[] s = name.split(" ");
        int p=s.length;
        int index = 0;
        for (int i = 0; i<p; i++){
            int len = s[index].length();
            char[] ch ;
            ch = s[index].toCharArray();
            int a = ch.length;
            for (k = 0; k < a; k++) {
                if (k == 0) {
                    ch[k] = (char) (ch[k] - 32);
                }
                System.out.print(ch[k]);
            }
            System.out.print(" ");
            index++;
        }
    }
}
