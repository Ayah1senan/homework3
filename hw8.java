import java.util.Scanner;

public class hw8 {
    //Write a program that asks the user to enter a month (1 for January, 2 for
    //February, etc.) and then prints the number of days in the month. For
    //February, print “28 days”.
    //Enter a month: 5
    //30 day

    public static void main(String[] args) {
        System.out.println("please enter a number from 1 to 12");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i == 1){
            System.out.println("JANAUARY ");
            System.out.println(" 30 days" );

        } else if (i==2) {
            System.out.println("FEBRUARY");
            System.out.println("28 days");
        }
        else if (i==3)
        {
            System.out.println("MARCH");
            System.out.println("31 days");
        } else if (i==4) {
            System.out.println("APRIL");
            System.out.println("30 days");

        } else if (i==5) {
            System.out.println("MAY");
            System.out.println("31 days");

        } else if (i==6) {
            System.out.println("JUNE");
            System.out.println("30 days");

        } else if (i==7) {
            System.out.println("JULY");
            System.out.println("31 days");

        } else if (i==8) {
            System.out.println("AUGUST");
            System.out.println("31 days");


        } else if (i==9) {
            System.out.println("SEPTEMBER");
            System.out.println("31 days");
        }

        else if (i==10) {
            System.out.println("OCTOBER");
            System.out.println("31 days");

        } else if (i==11) {
            System.out.println("NOVEMBER");
            System.out.println("30 days");


        } else if (i==12) {
            System.out.println("DECEMBER");
            System.out.println("31 days");

        }
        else
            System.out.println("WRONG INPUT");
    }
}
