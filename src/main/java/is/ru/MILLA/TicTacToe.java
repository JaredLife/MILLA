package is.ru.MILLA;

import java.util.Scanner;


public class TicTacToe{

	private static BusinessLogic bl = new BusinessLogic();


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to TicTacToe \n Player 1 please type in your name:");

		String Player1Name = sc.nextLine();

		System.out.println("\n Player 2 please type in your name:");

		String Player2Name = sc.nextLine();

		System.out.println("\n");

		System.out.println(bl.printGrid());
	


		System.out.println("Hello, World");
	}
}
