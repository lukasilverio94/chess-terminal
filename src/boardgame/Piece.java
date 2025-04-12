package boardgame;

public class Piece {

    // protected because is not a position of the chess,
    // just a simple matrix position, we don't want this position be visible on the Chess layer
    protected Position position;

    private Board board;

    public Piece(Board board){
        this.board = board;
        // When insert a Piece, we just need the Board, not the position, because first it will be null
        position = null; // by default, java already make this, just for learning
    }

    // PROTECTED because:
    // Only class on same package or subclases that will be allowed to access the Boarder's piece
    protected Board getBoard() {
        return board;
    }


}
