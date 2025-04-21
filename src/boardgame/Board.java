package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    // NO SET BOARD, we don't want set the Board, read-only

    // return the piece given the row and column
    public Piece piece(int row, int column){
        return pieces[row][column];
    }

    // Overloading (sobrecarga)
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    // Place pieces
    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] = piece;
        // now the position is not on null position anymore, so:
        piece.position = position; // accessible directly because is private field
    }
}
