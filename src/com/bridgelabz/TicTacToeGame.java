package com.bridgelabz;

public class TicTacToeGame {
    static char[] board = new char[10];
    static void createBoard(){
        for(int i = 1;i < board.length;i++){
            board[i] = ' ';
        }
        System.out.println("board is created");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe Game");
        createBoard();
    }
}
