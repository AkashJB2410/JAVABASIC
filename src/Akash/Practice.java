package Akash;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

public class Practice {
    public static void main(String[] args) throws IOException, URISyntaxException {
        File file = new File("C:\\Users\\Krsnaa\\IdeaProjects\\JAVABASIC\\src\\Akash\\Practice");
        File file2 = new File("C:\\Users\\Krsnaa\\IdeaProjects\\JAVABASIC\\src\\Akash\\OpenUrl");
        FileWriter fileWriter = new FileWriter(file.toString());
        FileWriter fileWriter2 = new FileWriter(file2.toString());
        FileReader fileReader = new FileReader(file);
        FileReader fileReader2 = new FileReader(file2);
        FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(fileReader));
        FileOutputStream fileOutputStream2 = new FileOutputStream(String.valueOf(fileReader2));
        System.out.println("1");
        System.out.println(fileWriter+"\t___________________________________\t"+fileWriter2);
        System.out.println("2");
        System.out.println(file+"\t___________________________________\t"+file2);
        System.out.println("3");
        System.out.println(fileReader+"\t___________________________________\t"+fileReader2);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        bufferedReader.toString();
        bufferedReader2.toString();
        System.out.println("4");
        System.out.println(bufferedReader+"\t___________________________________\t"+bufferedReader2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
        System.out.println("5");
        System.out.println(bufferedWriter+"\t___________________________________\t"+bufferedWriter2);
        URL url= new URL("C:\\Users\\Krsnaa\\IdeaProjects\\JAVABASIC\\src\\Akash\\Practic");
        java.awt.Desktop.getDesktop().browse(url.toURI());
        System.out.println(url);
    }
}
