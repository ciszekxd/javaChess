import UserInterface.TerminalInterface;

public class MainController {

    private static TerminalInterface TI = new TerminalInterface();

    public static void main(String[] args) {
        System.out.println("i am alive");
        TI.drawBoard();

    }
}
