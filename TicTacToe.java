package com.tictactoe;
import java.util.Scanner;

public class TicTacToe {
	//constants
	public static char user;
	public static char computer;
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
	}

}
