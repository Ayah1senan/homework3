import java.util.Scanner;

public class hw5 {


    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);


        System.out.println("please enter three numbers");
       int i =input1.nextInt();
        int z= input1.nextInt();
        int o= input1.nextInt();
        if (i==z&&i==o)
            System.out.println("numbers all the same");
        else
            System.out.println("numbers all different ");
    }
}
