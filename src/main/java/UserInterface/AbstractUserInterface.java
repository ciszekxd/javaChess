package UserInterface;

import Board.AbstractBoard;
import Board.ChessBoard;

public abstract class AbstractUserInterface {
    protected AbstractBoard board = new ChessBoard();
    abstract void drawBoard();
    abstract void move();


}
