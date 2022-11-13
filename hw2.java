import java.util.Scanner;

public class hw2
{
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        String color = "";

        while(true) {


            System.out.println( "Input square letter" );
            String letter = keyboard.next();

            System.out.println( "Input square number" );
            int number = keyboard.nextInt();


            if ( letter.equals("a") || letter.equals("c") || letter.equals("e") || letter.equals("g") )
            {
                if ( number % 2 != 0 )
                    color = "dark";
                else
                    color = "light";
            }
            else
            {
                if ( number % 2 == 0 )
                    color = "dark";
                else
                    color = "light";
            }

            System.out.println( "The color of the square is " + color );

        }
    }
}
