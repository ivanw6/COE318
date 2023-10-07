package coe318.lab5;
// Ivan Wang 501086429

import java.util.Scanner;

public class SimpleUI implements UserInterface {

    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

    @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

    @Override
    public void display() {
        System.out.println("\nHouse's Hand:\n-------------\n" + this.game.getHouseCards().toString());
        System.out.println("\nYour Hand:\n-------------\n" + this.game.getYourCards().toString());
    }

    @Override
    public boolean hitMe() {
        System.out.println("Hit? (y/n)");
        String choice = user.nextLine();
        boolean hit = false;
        switch (choice) {
            case "y":
                hit = true;
                break;
            case "n":
                hit = false;
                break;
            default:
                System.out.println("You must type either 'y' or 'n'.");
                hitMe();
        }
        return hit;
    }

    @Override
    public void gameOver() {
        int playerScore = game.score(game.getYourCards());
        int houseScore = game.score(game.getHouseCards());
        
        System.out.println("\nGAME OVER!!!\n");
        System.out.println("House's Final Hand:\n*******************\n" + this.game.getHouseCards().toString());
        System.out.println("Your Final Hand:\n****************\n" + this.game.getYourCards().toString());
        
        System.out.println("House: " + houseScore + "\nYour Score: " + playerScore);
        
        if ((playerScore > houseScore || houseScore > 21) && (playerScore <= 21)) {
            System.out.println("You are the WINNER!!!");
        } else {
            System.out.println("You are the LOSER!!!");
        }
    }
}
