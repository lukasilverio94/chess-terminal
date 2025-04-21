package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

// in portuguese -> Torre
public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R"; // On the position that this piece appears, it will be represented as "R" on terminal
    }
}
