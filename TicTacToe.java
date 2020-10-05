package com.tictactoe;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	//constants
	private final static int TAIL = 0;
	private final static int HEAD = 1;
	//variables
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
	private static int moveLocation(char[] board) {
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
        //checking if the location is free
	private static boolean isSpaceFree(char[] board, int location) {
		return board[location] == ' ';
		}
		//changing on board
	private static void makeMove(char[] board,char turn) {
		if(turn==user) {
			int location=moveLocation(board);
			board[location]=user;
			}
		else {
			int location=(int) (Math.floor((Math.random() * 10) % 9) + 1);
			if(isSpaceFree(board,location)==true) {
					board[location]=turn;
				}
			}
			displayBoard(board);
		}
	//toss
	private static int toss() {
		int toss=(int) (Math.floor(Math.random() * 10) % 2);
		return toss;
	}
	//checking who plays first
	private static void whoPlaysFirst(int toss,char[] board,char user,char computer) {
		if(toss==HEAD) {
			System.out.println("user plays first");
			makeMove(board,user);
		}
		else if(toss==TAIL) {
			System.out.println("computer starts the game");
			makeMove(board,computer);
		}
	}
	//checking winner
	private static boolean isWinner(char[] board,int toss) {
		return(board[1]==board[2]&&board[2]==board[3]||
		   board[4]==board[5]&&board[5]==board[6]||
		   board[7]==board[8]&&board[8]==board[9]||
		   board[1]==board[4]&&board[4]==board[7]||
		   board[2]==board[5]&&board[5]==board[8]||
		   board[3]==board[6]&&board[6]==board[9]||
		   board[1]==board[5]&&board[5]==board[9]||
		   board[3]==board[5]&&board[5]==board[7]); 
	}
	//i am playing in place of computer
	private static int computerTurn(char[] board,char turn) {
		int location= 0;
		while (location == 0) {
			int i = (int) (Math.floor((Math.random() * 10) % 9) + 1);
			if (isSpaceFree(board, i))
				location = i;
		}
		if(turn==computer) {
			if(board[5]==board[7]&&board[7]==computer||board[2]==board[3]&&board[2]==computer||board[5]==board[9]&&board[9]==computer||board[1] == ' ') {
				location=1;
				}
			else if(board[1]==board[3]&&board[1]==computer||board[5]==board[8]&&board[8]==computer||board[2] == ' '){
				location=2;
			}
			else if(board[1]==board[2]&&board[1]==computer||board[6]==board[9]&&board[9]==computer||board[5]==board[7]&&board[7]==computer||board[3] == ' ') {
				location=3;
			}
			else if(board[5]==board[6]&&board[6]==computer||board[7]==board[1]&&board[7]==computer||board[4] == ' ') {
				location =4;
			}
			else if(board[4]==board[6]&&board[6]==computer||board[2]==board[8]&&board[8]==computer||board[5] == ' '){
				location=5;
			}
			else if(board[4]==board[5]&&board[5]==computer||board[3]==board[9]&&board[9]==computer||board[6] == ' '){
				location =6;
			}
			else if(board[1]==board[4]&&board[1]==computer||board[8]==board[9]&&board[9]==computer||board[5]==board[3]&&board[3]==computer||board[7] == ' ') {
				location=7;
			}
			else if(board[2]==board[5]&&board[2]==computer||board[9]==board[7]&&board[9]==computer||board[8] == ' ') {
				location=8;
			}
			else if(board[8]==board[7]&&board[7]==computer||board[3]==board[6]&&board[6]==computer||board[1]==board[5]&&board[5]==computer||board[9] == ' ') {
				location =9;
			}
			else if(board[5]==board[7]&&board[7]==user||board[2]==board[3]&&board[2]==user||board[5]==board[9]&&board[9]==user||board[1] == ' ') {
				location=1;
				}
			else if(board[1]==board[3]&&board[1]==user||board[5]==board[8]&&board[8]==user||board[2] == ' '){
				location=2;
			}
			else if(board[1]==board[2]&&board[1]==user||board[6]==board[9]&&board[9]==user||board[5]==board[7]&&board[7]==user||board[3] == ' ') {
				location=3;
			}
			else if(board[5]==board[6]&&board[6]==user||board[7]==board[1]&&board[7]==user||board[4] == ' ') {
				location =4;
			}
			else if(board[4]==board[6]&&board[6]==user||board[2]==board[8]&&board[8]==user||board[5] == ' '){
				location=5;
			}
			else if(board[4]==board[5]&&board[5]==user||board[3]==board[9]&&board[9]==user||board[6] == ' '){
				location =6;
			}
			else if(board[1]==board[4]&&board[1]==user||board[8]==board[9]&&board[9]==user||board[5]==board[3]&&board[3]==user||board[7] == ' ') {
				location=7;
			}
			else if(board[2]==board[5]&&board[2]==user||board[9]==board[7]&&board[9]==user||board[8] == ' ') {
				location=8;
			}
			else if(board[8]==board[7]&&board[7]==user||board[3]==board[6]&&board[6]==user||board[1]==board[5]&&board[5]==user||board[9] == ' ') {
				location =9;
			}
			
		}
		return location;
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
		makeMove(board,user);
		isWinner(board,toss());
	}

}
