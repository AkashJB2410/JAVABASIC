package Akash;

import java.util.Scanner;

public class ExceptionFind {
    public static void main(String[] args) throws Exception{
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc1.nextInt();
        try {
            if(age<18)
            {

                throw new InvalidAgeException("Enter your age greater than 18");
            }
            else
            {
                System.out.println("valid age and applicable for votting");
            }
        }
        catch(InvalidAgeException e)
        {
            e.printStackTrace();
        }

    }
}
class InvalidAgeException extends Exception {
public InvalidAgeException(String massage){
    super(massage);
}
public InvalidAgeException(){}
}
