
package is.ru.MILLA;

import java.util.Scanner;


public class TicTacToe{

        private Scanner scan;


        public TicTacToe()
        {
                scan = new Scanner(System.in);
        }

        public void welcome()
        {
		clear();
                System.out.println("Welcome to TicTacToe, an epic game of mind jousting");
                System.out.println("Speak your names, mighty warriors! and good luck");

        }

        public Player newPlayer(int playerNum)
        {
                System.out.println("Player " + playerNum + ": ");
                String playerName = scan.next();
                Player player = new Player(playerNum, playerName);

                return player;
        }

        public int pickABox(BusinessLogic newGame)
        {
                int input = 0;
                boolean validInput = false;
                while(!validInput){
                        System.out.println("Box number: ");
                        String inputString = scan.next();
			input = inputString.charAt(0) - 48;
                        if(newGame.isValidInput(input)){
                                validInput = true;
                        }else{
                                System.out.println("That is not a valid option");
                        }
                }
                return input;
        }

        private void boxMessage(Player player)
        {
                System.out.println(player.getName() + ", pick an empty box to mark as yours");
        }

        private void winMessage(Player winner, Player loser)
        {
                System.out.println(winner.getName() + " has slaughtered " + loser.getName() + "!");
        }

        public boolean continueMessage()
        {
                System.out.println("Do you want to play another game of TicTacToe?");

                boolean unvalidResponse = true;
                boolean answer = false;

                while(unvalidResponse){
                        System.out.println("y/n: ");
                        String ans = scan.next();
                        if(ans.equals("y") || ans.equals("Y")){
                                answer = true;
                                unvalidResponse = false;
                        }else if(ans.equals("n") || ans.equals("N")){
                                answer = false;
                                unvalidResponse = false;
                        }else{
                                System.out.println("Not a valid input");
                        }
                }
                return answer;
        }

        private static void clear()
        {
               // System.out.print("\033[H\033[2J");
		System.out.print("\u001b[2J");
                System.out.flush();
        }

        public void playGame(Player player1, Player player2)
        {

                BusinessLogic newGame = new BusinessLogic(player1, player2);

                boolean gameOver = false;
                int turnNum = 0;

                while(!gameOver){
                        clear();
                        System.out.println(newGame.getGrid());

                        if(turnNum % 2 == 0){
                                boxMessage(player1);
                        }else{
                                boxMessage(player2);
                        }

                        newGame.markNode(pickABox(newGame),turnNum);

                        if(newGame.bingo()){
                                clear();
				System.out.println(newGame.getGrid());
				if(turnNum % 2 == 0){
                                        winMessage(player1, player2);
                                }else{
                                        winMessage(player2, player1);
                                }

                                gameOver = true;
                        }

                        if(turnNum == 8){
				clear();
				System.out.println(newGame.getGrid());
                                System.out.println("You are equally bright!    ...or stupid.");
                                gameOver = true;
                        }
                        turnNum++;
                }
        }


        public static void main(String[] args)
        {
                TicTacToe t = new TicTacToe();

                boolean play = true;

                while(play)
                {
                        t.welcome();

                        Player player1 = t.newPlayer(1);
                        Player player2 = t.newPlayer(2);

                        t.playGame(player1, player2);

                        play = t.continueMessage();
                }

        }

}

