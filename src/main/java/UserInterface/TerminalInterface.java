package UserInterface;

public class TerminalInterface extends AbstractUserInterface {


    @Override
    public void drawBoard() {
        board.updatePositions();
        int boardLength = board.getBoardLength();
        for(int i=0; i<boardLength; i++){
            for(int j=0; j<boardLength; j++){
                System.out.print("["+board.getElementValueByTableCoords(j,i)+"]");
            }
            System.out.print("\n");
        }
    }

    @Override
    void move() {

    }
}
