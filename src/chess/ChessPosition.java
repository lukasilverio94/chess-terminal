package chess;

import boardgame.BoardException;
import boardgame.Position;

public class ChessPosition {
    /*
    class for mapping from a matrix coordinates (n, n) to a combination of letters (a, b, c, d, e, f, g, h)
    and numbers, representing rows/columns, respectively
     */
    private final char column;
    private final int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new BoardException("Error instantiating ChessPosition. Valid values are form a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    // inverse from method above
    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString(){
        return "" + column + row;
    }
}
