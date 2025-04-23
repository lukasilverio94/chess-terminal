package chess.pieces;

import boardgame.Board;
import boardgame.Position;
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

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matrix = new boolean[getBoard().getRows()][getBoard().getColumns()];
        // auxiliar position P
        Position p = new Position(0, 0 );

        // check positions above
        p.setValues(position.getRow() - 1, position.getColumn());
        // while p exists and there's no piece there (empty), make this position (true)
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matrix[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }

        // if there's an opponent piece, make it true this position (we will capture it)
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColumn()] = true;
        }

        // check positions at left
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        // while p exists and there's no piece there (empty), make this position (true)
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matrix[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }

        // if there's an opponent piece, make it true this position (we will capture it)
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColumn()] = true;
        }

        // check positions at right
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        // while p exists and there's no piece there (empty), make this position (true)
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matrix[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }

        // if there's an opponent piece, make it true this position (we will capture it)
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColumn()] = true;
        }

        // check positions bellow
        p.setValues(position.getRow() + 1, position.getColumn());
        // while p exists and there's no piece there (empty), make this position (true)
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matrix[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }

        // if there's an opponent piece, make it true this position (we will capture it)
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)){
            matrix[p.getRow()][p.getColumn()] = true;
        }


        return matrix;
    }
}
