package Akash;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class  OpenUrl {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        System.out.println("Process Done");
        URL url= new URL("https://github.com/AkashJB2410");
        URL url1= new URL("https://www.google.co.in/");
        URL url2= new URL("https://techjivaaindia.in/");
        URL url3= new URL("https://krsnaadiagnostics.com/");
        java.awt.Desktop.getDesktop().browse(url.toURI());
        java.awt.Desktop.getDesktop().browse(url1.toURI());
        java.awt.Desktop.getDesktop().browse(url2.toURI());
        java.awt.Desktop.getDesktop().browse(url3.toURI());
    }
}
