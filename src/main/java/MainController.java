import Command.TerminalCommand;
import UserInterface.TerminalInterface;

import java.io.IOException;

public class MainController {

    private static TerminalInterface TI = new TerminalInterface(new TerminalCommand());

    public static void main(String[] args) throws IOException {
        System.out.println("i am alive");
        TI.drawBoard();
        TI.move();

    }
}
