package Board;

import Pieces.*;

import java.util.ArrayList;

public class ChessBoard extends AbstractBoard {

    public ChessBoard(){
        initialiseBoard();
    }

    private ArrayList<AbstractPiece> Pieces = new ArrayList<AbstractPiece>();

    private void initialiseBoard(){

        // place white pawns
        for(int i=0; i<8; i++) {
            Pieces.add(new Pawn(true));
            Pieces.get(i).setPositionXY(i,1);
        }
        //place black pawns
        for(int i=0; i<8; i++) {
            Pieces.add(new Pawn(false));
            Pieces.get(i+8).setPositionXY(i,6);
        }
        //place white rooks
        Pieces.add(new Rook(true));
        Pieces.get(16).setPositionXY(0,0);

        Pieces.add(new Rook(true));
        Pieces.get(17).setPositionXY(7,0);

        //place black rooks
        Pieces.add(new Rook(false));
        Pieces.get(18).setPositionXY(0,7);

        Pieces.add(new Rook(false));
        Pieces.get(19).setPositionXY(7,7);

        //place white Knights
        Pieces.add(new Knight(true));
        Pieces.get(20).setPositionXY(1,0);

        Pieces.add(new Knight(true));
        Pieces.get(21).setPositionXY(6,0);

        //place black Knights

        Pieces.add(new Knight(false));
        Pieces.get(22).setPositionXY(1,7);

        Pieces.add(new Knight(true));
        Pieces.get(23).setPositionXY(6,7);

        //place white Bishops

        Pieces.add(new Bishop(true));
        Pieces.get(24).setPositionXY(2,0);

        Pieces.add(new Bishop(true));
        Pieces.get(25).setPositionXY(5,0);

        //place black Bishops

        Pieces.add(new Bishop(false));
        Pieces.get(26).setPositionXY(2,7);

        Pieces.add(new Bishop(false));
        Pieces.get(27).setPositionXY(5,7);

        //place white Queen
        Pieces.add(new Queen(true));
        Pieces.get(28).setPositionXY(3,0);

        //place black Queen
        Pieces.add(new Queen(false));
        Pieces.get(29).setPositionXY(3,7);

        //place white King
        Pieces.add(new King(true));
        Pieces.get(30).setPositionXY(4,0);

        //place black King
        Pieces.add(new King(false));
        Pieces.get(31).setPositionXY(4,7);
        
    }

    @Override
    public void updatePositions(){

        resetBoard();

        int[] pivot = new int[2];

        for (AbstractPiece piece : Pieces) {
            pivot = piece.getPosition();
            setBoardElement(pivot[0],pivot[1],piece.getPieceId());

        }
    }

    @Override
    void changePosition() {

    }
}
