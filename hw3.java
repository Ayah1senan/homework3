import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        int n1;
        Scanner number = new Scanner(System.in);
        System.out.println("please enter a number");
       n1 = number.nextInt();
       if (n1<0)
           System.out.println("the number is negative ");
          if (n1>0)
               System.out.println("the number is positive");

              if (n1==0)
                  System.out.println("ZERO");



    }}


