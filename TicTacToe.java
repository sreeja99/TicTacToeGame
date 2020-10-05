package com.tictactoe;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	//constants
	public static char user;
	public static char computer;
	public static char turn;
	public static char board;
	// Create board with Empty Spaces
	private char[] createBoard() {
		char[] board = new char[10];
			for (int i = 1; i < 10; i++) {
				board[i] = ' ';
				}
				return board;
			}
	//choosing letter
	private static char chooseLetter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Letter");
		return sc.next().charAt(0);
	}
	//displaying board
	private static void displayBoard(char[] board) {
		System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
		System.out.println("______________");
		System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
		System.out.println("______________");
		System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
	}
	// Move to desired location
		private static int moveLocation(char[] board,char user) {
			Scanner sc = new Scanner(System.in);
			Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			while (true) {
				System.out.println("Enter the number between 1 and 9");
				int location = sc.nextInt();
				if (Arrays.asList(values).contains(location) && isSpaceFree(board, location)) {
					return location;
				}
			}

		}

		private static boolean isSpaceFree(char[] board, int location) {
			return board[location] == ' ';
		}
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe program");
        TicTacToe ticTacToe = new TicTacToe();
		char[] board = ticTacToe.createBoard();
		char user=ticTacToe.chooseLetter();
		//assigning computer letter
		if(user=='X') {
			computer='O';
		}
		else {
			computer='X';
		}
		displayBoard(board);
		moveLocation(board,user);
	}

}
