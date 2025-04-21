package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

// Core of our Chess
// Rules for the game
public class ChessMatch {

    private final Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    // retorna a matriz de pecas da nossa partida de xadrez
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        // percorrrer matriz de pecas do tabuleiro
        // pra cada peca do tabuleiro, fazer um downcasting para ChessPiece[][]
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    // initialize the match placing the pieces on the board
    private void initialSetup() {
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));

    }
}
