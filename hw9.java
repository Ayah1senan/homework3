import java.util.Scanner;

public class hw9 {

        //declare the main method
        public static void main(String[] args) {
            //declare variables
            int inputMonth = 0;
            int inputDay = 0;
            // welcome the user
            System.out.println("I can what season it is if you tell me the number indecating the month and one indecating the day. ");
            // get ready to read the user data
            Scanner keyboard = new Scanner(System.in);
            // prompt the user for a number for month
            System.out.print("Please enter a number from 1 to 12 to indecate the month: ");
            // store the user input
            inputMonth = keyboard.nextInt();


            // evaluate valid input for month
            boolean validInput = true;
            if (inputMonth > 12 || inputMonth < 1) {
                System.out.println(inputMonth + " is not a valid month.");
                validInput = false;
            }
            else{
                // prompt the user for a number for day
                System.out.print("Please enter a number from 1 to 31 to indecate the day: ");
                // store the user input
                inputDay = keyboard.nextInt();
                // evaluate valid input for month
                if (inputDay > 31 || inputMonth < 1) {
                    System.out.println(inputDay + " is not a valid day.");
                    validInput = false;

                }//if for day END

            }//if for month END

            // if we have valid data we work else we quit
            if (validInput){
                //variable to hold the season
                String season = "";
                //evaluate inputMonth and set the season accordingly
                if (inputMonth == 1 || inputMonth == 2 || inputMonth == 3){
                    season = "Winter";
                }
                else if (inputMonth == 4 || inputMonth == 5 || inputMonth == 6){
                    season = "Spring";
                }
                else if (inputMonth == 7 || inputMonth == 8 || inputMonth == 9){
                    season = "Summer";
                }
                else{
                    season = "Fall";
                }//if for monthInput END
                //evaluate inputDay and update season accordingly

                if (inputMonth % 3 == 0 && inputDay >= 21){
                    if (season.equalsIgnoreCase("Winter")){
                        season = "Spring";
                    }
                    else if (season.equalsIgnoreCase("Spring")){
                        season = "Summer";
                    }
                    else if(season.equalsIgnoreCase("Summer")){
                        season = "Fall";
                    }
                    else{
                        season = "Winter";
                    }//if for 21 END
                }//if for inputDay END
                System.out.println("I think it is\t" + season);
            }
            else{
                System.out.println(validInput + " data so quitting.");
            }//if valid input END







        }//main END
    }
