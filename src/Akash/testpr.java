package Akash;

import java.util.ArrayList;

public class testpr {
    public static void main(String[] args) {
        OpenUrl openUrl = new OpenUrl();
        openUrl.equals(openUrl);
        System.out.println( openUrl.equals(openUrl));

        ArrayList  arrayList = new ArrayList();
        arrayList.add(50);
        arrayList.add("Akash");
        arrayList.add('A');
        arrayList.add('K');
        arrayList.add('A');
        arrayList.add('S');
        arrayList.add('H');
        System.out.println(arrayList);
        arrayList.forEach(System.out::println);
    }
}
