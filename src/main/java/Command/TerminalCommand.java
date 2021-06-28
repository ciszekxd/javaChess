package Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class TerminalCommand extends AbstractCommand{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



    @Override
    // awaited input example: "E4 A7"
    void processCommand() {
        String[] Split = roughInput.split(" ");
        String fromX = Character.toString(Split[0].charAt(0));
        int fromY = Integer.parseInt(String.valueOf(Split[0].charAt(1)));
        String toX = Character.toString(Split[1].charAt(0));
        int toY = Integer.parseInt(String.valueOf(Split[1].charAt(1)));
        fromCords = new int[] {translateXCords(fromX), fromY};
        toCords = new int[] {translateXCords(toX),toY};

        /*
        System.out.println(fromCords[0]);
        System.out.println(fromCords[1]);
        System.out.println(toCords[0]);
        System.out.println(toCords[1]);
        System.out.println(translateXCords(fromX));
        System.out.println(Split[0].charAt(1));
        System.out.println(translateXCords(toX));
        System.out.println(Split[1].charAt(1));*/

    }

    @Override
    public void getCommandFromUser() throws IOException {
        roughInput = reader.readLine();
        processCommand();
    }


    protected int translateXCords(String x) {
        int intX = -1;
        if (x.equals("A")) intX = 0;
        else if (x.equals("B")) intX = 1;
        else if (x.equals("C")) intX = 2;
        else if (x.equals("D")) intX = 3;
        else if (x.equals("E")) intX = 4;
        else if (x.equals("F")) intX = 5;
        else if (x.equals("G")) intX = 6;
        else if (x.equals("H")) intX = 7;
        //else throw new ExecutionException();
        return intX;
    }
}
