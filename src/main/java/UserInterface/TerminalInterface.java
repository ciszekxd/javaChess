package UserInterface;

import Command.AbstractCommand;
import Pieces.AbstractPiece;

import java.io.IOException;

public class TerminalInterface extends AbstractUserInterface {

    public TerminalInterface(AbstractCommand command){
        this.commandInput = command;
    }

    @Override
    public void drawBoard() {
        board.updatePositions();
        int boardLength = board.getBoardLength();
        for(int i=boardLength-1; i>=0; i--){
            System.out.print("["+(i)+"]");
            for(int j=boardLength-1; j>=0; j--){

                AbstractPiece pieceOnPosition = board.findPieceByCoords(j,i);
                if (pieceOnPosition == null) {
                    System.out.print("[0" + board.getElementValueByTableCoords(j, i) + "]");
                }
                else{
                    if(pieceOnPosition.getColor()){
                        System.out.print("[W" + board.getElementValueByTableCoords(j, i) + "]");
                    }else {
                        System.out.print("[B" + board.getElementValueByTableCoords(j, i) + "]");
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.print("[ ][ A][ B][ C][ D][ E][ F][ G][ H]\n");
    }



    @Override
    public void move() throws IOException {
        commandInput.getCommandFromUser();
    }
}
