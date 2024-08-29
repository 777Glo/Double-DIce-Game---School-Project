import java.util.Scanner; // Scanner tool

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double money = 100.00;

            double bet;

            String response;

     do {

        if (money == 0) {
            money = 100.00;

     }

     // Begining of the game

     while (money > 0) {
        System.out.printf("You have $%.2f%n", money);
        System.out.println("How much would you like to bet? (bet 0 to end game)"); 
        System.out.print("---> :");
       
        bet = scanner.nextDouble();

        System.out.println(); // This is the spacing in between statements!!

     // If the player hits 0 it ends the game !! YES I KNOW IT ASKS IF YOU WANT TO CONTINUE PLAYING AFTER 0, ITS BECAUSE IF THE PLAYER DOESNT WANT TO IT SAVES PROGRESS

     if (bet == 0) {
        System.out.println("Goodbye, thanks for playing!");

        // For game spacing
       
        System.out.println(); 
       
       // Breaking the loop

       break;

     }

     // Setting the bet limit, so the player cannot bet more than they have

     if (bet > money) {
        System.out.println("You cannot bet more than you have!");

        continue; // Continues the loop

     }

     // Setting up the dice

     Die die1 = new Die();
     Die die2 = new Die();

     // If everything above works

     die1.roll();
     die2.roll();

     // The system telling you what you rolled after Die is initialized

     System.out.printf("You rolled a %s and %s%n", die1.toString(), die2.toString());

     // If the player rolled doubles, WIN

     if (die1.equals(die2)) {
        money += bet;
        System.out.printf("You win $%.2f%n", bet);

     }

     // If the player does not roll doubles, LOSS

     else {
        money -= bet;
        System.out.printf("You lose $%.2f%n", bet);

     }

     // If the player runs out of money

     if (money == 0) {
        System.out.println("You are out of money! Better luck next time");

        break; 

        }
     }

     // The system asking the player if they want to continue playing

     System.out.print("Do you want to continue playing? (Y/N): ");
         response = scanner.next();
        System.out.println();

     }

     // The system ignores the letter N  and continues the loop, If Y is pressed the loop restarts @ the do{} statement on line 17 (not sure if I looped the end of the game right, it still works though)
     while (!response.equalsIgnoreCase("N"));
        System.out.println("Thanks for playing Double Dice Game! Hope to see you back, goodbye.");
      System.out.println(); // For Spacing

     // Closing the script ending the program
        scanner.close();

        }  

    }














