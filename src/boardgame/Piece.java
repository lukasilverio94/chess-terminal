package boardgame;

public abstract class Piece {

    // protected because is not a position of the chess,
    // just a simple matrix position, we don't want this position be visible on the Chess layer
    protected Position position;

    private final Board board;

    public Piece(Board board) {
        this.board = board;
        // When insert a Piece, we just need the Board, not the position, because first it will be null
        position = null; // by default, java already make this, just for learning
    }

    // PROTECTED because:
    // Only class on same package or subclasses that will be allowed to access the Boarder's piece
    protected Board getBoard() {
        return board;
    }

    // All possible moves (hook method)
    public abstract boolean[][] possibleMoves();

    // Possible move to given position
    // Concrete method that is using an abstract method ( hook methods )
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] matrix = possibleMoves();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
