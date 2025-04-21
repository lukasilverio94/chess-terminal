package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces){
        for (int i = 0; i < pieces.length; i++){
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println(); // break line in each row
        }
        System.out.println("  a b c d e f g h");
    }

    // print only one piece
    // after we use on the function above to print all pieces
    // depending on the condition
    private static void printPiece(ChessPiece piece){
        if (piece == null) {
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
