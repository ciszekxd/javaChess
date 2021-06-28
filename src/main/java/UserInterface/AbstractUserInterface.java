package UserInterface;

import Board.AbstractBoard;
import Board.ChessBoard;
import Command.AbstractCommand;

import java.io.IOException;

public abstract class AbstractUserInterface {
    protected AbstractBoard board = new ChessBoard();
    protected AbstractCommand commandInput;
    abstract void drawBoard();
    abstract void move() throws IOException;


}
