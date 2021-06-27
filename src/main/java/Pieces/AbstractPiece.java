package Pieces;

public abstract class AbstractPiece {

    int pieceId = -1;
    boolean isWhite;
    int positionX = -1;
    int positionY = -1;

    public void setPositionXY(int x, int y) {
        if(x < 8 && x >= 0) {
            positionX = x;
        }
        if(y < 8 && y >= 0) {
            positionY = y;
        }
    }

    public boolean getColor(){
        return isWhite;
    }

    public int getPieceId(){
        return pieceId;
    }

    public int[] getPosition() {
        return new int[] {positionX, positionY};
    }

    abstract void calculatePossibleMoves();

}
