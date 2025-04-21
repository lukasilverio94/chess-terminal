package chess;

import boardgame.Board;

// Core of our Chess
// Rules for the game
public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
    }

    // retorna a matriz de pecas da nossa partida de xadrez
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        // percorrrer matriz de pecas do tabuleiro
        // pra cada peca do tabuleiro, fazer um downcasting para ChessPiece[][]
        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
